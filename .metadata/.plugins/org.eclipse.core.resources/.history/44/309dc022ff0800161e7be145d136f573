package ex6Consumer;

class Reader extends Thread {
	Buffer b;
	public void run() {
		 char x;
		 while ((x = b.get()) != '\032')
			 System.out.print(x);
	}
	 
	Reader(Buffer b) {
		this.b = b;
	}
} 