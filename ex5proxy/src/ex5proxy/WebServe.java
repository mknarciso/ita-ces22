package ex5proxy;
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;


class WebServe implements Runnable {
	 Socket soc; 
	 OutputStream os; 
	 DataInputStream is;
	 void getRequest() {
		 try {
			 String message;
			 while ((message = is.readLine()) != null) {
				 if (message.equals(""))
					 break; // end of command block
				 System.err.println(message);
				 StringTokenizer t = new StringTokenizer(message);
				 String token = t.nextToken(); // get first token
				 if (token.equals("GET")) // if token is ”GET”
					 resource = t.nextToken(); // get second token
			 }
		 } catch (IOException e) {
			 System.err.println("Error receiving Web request");
		 }
	 }
	 
	 void returnResponse() {
		 int c;
		 try {
			 FileInputStream f = new FileInputStream("." + resource);
			 while ((c = f.read()) != -1)
				 os.write(c);
			 f.close();
		 } catch (IOException e) {
			 System.err.println("IOException in reading in Web " + "server");
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
		 }
	 }
	 
	 public void close() {
		 try {
			 is.close(); 
			 os.close(); 
			 soc.close();
		 } catch (IOException e) {
			 System.err.println("IOException in closing connection");
		 }
	 }
	 WebServe(Socket s) throws IOException {
		 soc = s;
		 os = soc.getOutputStream();
		 is = new DataInputStream(soc.getInputStream());
	 }
	 
	 
} 