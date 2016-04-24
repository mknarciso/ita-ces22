package ex6Consumer;

import java.io.FileInputStream;

class Writer extends Thread {
	 Buffer b;
	 FileInputStream fs;
	 public void run() {
		 int x;
		 String output = "Um produtor("+this.getName()+") disponinbilizou um novo invent�rio: ";
		 try {
			 while ((x = fs.read()) != -1){
				 output += (char) x;
				 b.put((char) x);
			 }
			 output += ' ';
			 System.out.println(output);
		 } catch (Exception e) {
			 System.err.println("Cannot read");
			 System.exit(1);
		 }
	 }
	 
	 Writer(String fname, Buffer b) {
		 this.b = b;
		 try {
			 fs = new FileInputStream(fname);
			 System.out.println("Um novo produtor(" + this.getName() + ") nasceu, com este invent�rio: " + fname);
		 } catch (Exception e) {
			 fs = null;
			 System.err.println("Cannot open "+fname);
			 System.exit(1);
		 }
	 }
} 