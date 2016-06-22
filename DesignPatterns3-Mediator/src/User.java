
public abstract class User{
	
	private Mediator operadora;
	private int id;
	
	public User(Mediator newMediator){ 
		operadora = newMediator; 
		int id = operadora.addUser(this);
		System.out.println("User created, id: "+id+"!");
	}
	
	public void sendSMS(String msg, int to){
		operadora.receiveSMS(msg, this.id, to);
	}
	
	public void receiveSMS(){
		operadora.deliverSMS(this.id);
	}
	
	public void setId(int code){ id = code; }
	
	
}