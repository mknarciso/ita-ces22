package ex5proxy;
import java.io.*;
import java.net.*;
class WebRetriever {
	 Socket soc; 
	 OutputStream os; 
	 InputStream is;
	 
	 WebRetriever(String server, int port)	 throws IOException, UnknownHostException {
		 soc = new Socket(server, port);
		 os = soc.getOutputStream();
		 is = soc.getInputStream();
	 }
	 
	 void request(String path) {
		 try {
			 String message = "GET " + path + "\n\n";
			 os.write(message.getBytes());
			 os.flush();
			 //int c;
			 //System.out.println("REQUEST: ");
			 //while ((c = is.read()) != -1)
			//	 System.out.print((char) c);
		 } catch (IOException e) {
			 System.err.println("Error in HTTP request");
		 }
	 }
	 
	 void getResponse() {
		 int c;
		 try {
			 while ((c = is.read()) != -1)
				 System.out.print((char) c) ;
		 } catch (IOException e) {
			 System.err.println("IOException in reading from " + "Web server");
		 }
	 }
	 String getResponseString(){
		 //int[] result;
		 int c;
		 //int i=0;
		 String result = "";
		 System.out.println("GET RESPONSE STRING:");
		 try{
			 while ((c = is.read()) != -1){
				 //result[i] = c;
				 //i++;
				 System.out.print((char) c);
				 result += (char)c;
			 }
		 } catch (IOException e){
			 System.err.println("IOException in reading from " + "Web server");
		 }
		 return result;
	 }
	 
	 
	 public void close() {
		 try {
			 is.close(); os.close(); soc.close();
		 } catch (IOException e) {
			 System.err.println("IOException in closing connection");
		 }
	 }
	 
	/* public static void main(String[] args) {
		 try {
			 WebRetriever w = new WebRetriever("www.uol.com.br", 80);
			 w.request("/");
			 w.getResponse();
			 w.close();
		 } catch (UnknownHostException h) {
			 System.err.println("Hostname Unknown");
		 } catch (IOException i) {
			 System.err.println("IOException in connecting to Host");
		 }
	 }*/
}