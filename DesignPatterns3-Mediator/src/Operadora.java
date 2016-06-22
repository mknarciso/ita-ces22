import java.util.ArrayList;
import java.util.Iterator;

public class Operadora implements Mediator{

	private ArrayList<User> users;
	private ArrayList<Sms> received;
	private ArrayList<Sms> processed;
	
	private int codes = 0;
	
	public Operadora(){
		
		users = new ArrayList<User>();
		received = new ArrayList<Sms>();
		processed = new ArrayList<Sms>();
	}
	
	public int addUser(User newUser){
		users.add(newUser);
		codes++;
		newUser.setId(codes);
		return codes;
	}
	
	public void deliverSMS(int to) {
		boolean have = false;
		//for(Sms stack: received){
	    Iterator<Sms> it = received.iterator();

        while(it.hasNext()){
        Sms stack = it.next();
			if(stack.getTo() == to){
				System.out.println("\nMessage Delivered:");
				System.out.println( 
						"from: " + stack.getFrom() + 
						", to: " + stack.getTo()+ 
						"\nMessage: " + stack.getMsg() + "\n"
						);
				processed.add(stack);
				it.remove();
				have = true;
			} 
		}
		if(!have) {
			System.out.println("No messages for this user!");
		}
	}

	public void receiveSMS(String msg, int from, int to){
		Sms newMessage = new Sms(from, msg, to);
		received.add(newMessage);
		System.out.println("Message (from "+from+")received by mediator, waiting receiver User("+to+") to claim it!");

	}
	
	public void getStatus(){
		
		System.out.println("\nMessages waiting for receiver to claim:");
		for(Sms stack: received){
			System.out.println("\n"+stack.getMsg() + "\nFrom:"+stack.getFrom()+"\nTo:"+stack.getTo());
		}
		System.out.println("\nMessages Delivered:");
		for(Sms stack: processed){
			System.out.println("\n"+stack.getMsg() + "\nFrom:"+stack.getFrom()+"\nTo:"+stack.getTo());
		}
	}
}