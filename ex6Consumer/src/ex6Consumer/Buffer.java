package ex6Consumer;

class Buffer {
	
	 final int MAXSIZE = 512;
	 char keep[];
	 int count, front, rear;
	 
	 public synchronized char get() {
		 while (count == 0)
			try {
				System.out.println("Um consumidor(" + this + ") entrou na fila");
				System.out.println("wait:" + this.hashCode());
				
				this.wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 char x = keep[rear];
		 rear = (rear+1) % MAXSIZE;
		 count--;
		 notifyAll(); // that a space is now available
		 return x;
	 }
	 
	 public synchronized void put(char x) {
		 while (count == MAXSIZE)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 keep[front] = x;
		 front = (front+1) % MAXSIZE;
		 count++;
		 notifyAll(); // that an item is now available
	 }
	 
	 Buffer() {
		 System.out.println("Um novo marketplace(" + this.hashCode() + ") foi criado.");
		 keep = new char [MAXSIZE];
		 count = 0;
		 front = rear = 0;
	 }
	 	 
} 

