package ex5proxy;
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;


class WebServe implements Runnable {
	 Socket soc; 
	 OutputStream os; 
	 DataInputStream is;
	 String resource;
	 String full_request;
	 void getRequest() {
		 try {
			 full_request="";
			 boolean header = true;
			 String message;
			 while ((message = is.readLine()) != null) {
				 if (message.equals(""))
					 break; // end of command block
				 StringTokenizer t = new StringTokenizer(message);
				 String token = t.nextToken(); // get first token
				 if (token.equals("GET")){ // if token is �GET�
					 resource = t.nextToken(); // get second token
					 header = false;
				 }
				 if (header==false)
					 full_request += message + "\n";
			 }
			 System.out.println(full_request);
		 } catch (IOException e) {
			 System.err.println("Error receiving Web request");
			 e.printStackTrace();
		 }
	 }
	 
	 void returnResponse() {
		 String address="", request="/";
		 boolean emptyRequest = true;
		 try {
			 char[] res = resource.toCharArray();
			 for(int i=1;i<resource.length();i++){
				 if(emptyRequest){
					 if(res[i]=='/'){
						 emptyRequest=false;
					 }
					 else
						 address += res[i];
				 }
				 else{
					 request += res[i];
				 }
			 }
			 System.out.println("Address: " + address);
			 System.out.println("Request: " + request);
			 WebRetriever w = new WebRetriever(address, 80);
			 w.request(request,address);
			 byte[] write_b = w.getResponseString().getBytes();
			 System.out.print(w.getResponseString());
			 os.write(write_b);
			 w.close();
		 } catch (IOException e) {
			 System.err.println("IOException in reading in Web " + "server");
			 e.printStackTrace();

		 }
	 }
	 
	 public void run() {
		 getRequest();
		 returnResponse();
		 close();
	 }
	 

	public static void main(String args[]) {
		 try {
			 ServerSocket s = new ServerSocket(8080);
			 for (;;) {
				 WebServe w = new WebServe(s.accept());
				 Thread thr = new Thread(w);
				 thr.start();

			 }
		 } catch (IOException i) {
			 System.err.println("IOException in Server");
			 i.printStackTrace();
		 }
	 }
	 
	 public void close() {
		 try {
			 is.close(); 
			 os.close(); 
			 soc.close();
		 } catch (IOException e) {
			 System.err.println("IOException in closing connection");
			 e.printStackTrace();
		 }
	 }
	 WebServe(Socket s) throws IOException {
		 soc = s;
		 os = soc.getOutputStream();
		 is = new DataInputStream(soc.getInputStream());
	 }
	 
	 
} 