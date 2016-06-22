public class Sms{
	
	private int from = 0;
	private String message = "";
	private int to = 0;
	
	public Sms(int fromId, String msg, int toId){
		
		from = fromId;
		message = msg;
		to = toId;
		
	}
	
	public int getTo() { return to; }
	public String getMsg() { return message; }
	public int getFrom() { return from; }
	
}