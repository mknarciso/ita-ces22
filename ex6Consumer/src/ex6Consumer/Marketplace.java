package ex6Consumer;
public class Marketplace {
	
	 public static void main(String args[]) {
		 Buffer b = new Buffer();
		 Writer w1 = new Writer("entrada.txt",b);
		 Writer w2 = new Writer("entrada2.txt",b);
		 Reader r1 = new Reader(b);
		 Reader r2 = new Reader(b);
		 Reader r3 = new Reader(b);
		 
		 w1.start();
		 w2.start();
		 r1.start();
		 r2.start();
		 r3.start();
	 }

}
