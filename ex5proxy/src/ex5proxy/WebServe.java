package ex5proxy;
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;


class WebServe implements Runnable {
	 Socket soc; 
	 OutputStream os; 
	 DataInputStream is;
	 String resource;
	 void getRequest() {
		 try {
			 String message;
			 //System.out.println(is.read());
			 while ((message = is.readLine()) != null) {
				 if (message.equals(""))
					 break; // end of command block
				 System.out.println(message);
				 StringTokenizer t = new StringTokenizer(message);
				 String token = t.nextToken(); // get first token
				 if (token.equals("GET")) // if token is ”GET”
					 resource = t.nextToken(); // get second token
				 
			 }
		 } catch (IOException e) {
			 System.err.println("Error receiving Web request");
			 e.printStackTrace();
		 }
	 }
	 
	 void returnResponse() {
		 //int c;
		 String address="", request="";
		 boolean emptyRequest = true;
		 try {
			 char[] res = resource.toCharArray();
			 for(int i=1;i<resource.length();i++){
				 if(emptyRequest){
					 if(res[i]=='/'){
						 emptyRequest=false;
						 request += res[i];
					 }
					 else
						 address += res[i];
				 }
				 else{
					 request += res[i];
				 }
			 }
			 WebRetriever w = new WebRetriever(address, 80);
			 w.request(request);
			 char[] write = w.getResponseString().toCharArray();
			 //byte[] bytes = toBytes(write);
			 System.out.print(w.getResponseString());
			 for(int i=0;i<write.length;i++){
				 os.write((byte) (write[i] & 0xFF));
				 
			 }
			 //os.write(w.getResponseString());
			 w.close();

			 
			 //FileInputStream f = new FileInputStream(resource);
			 //while ((c = f.read()) != -1)
				 //System.out.print((char) c);
			 //os.write(c);
			 //f.close();
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