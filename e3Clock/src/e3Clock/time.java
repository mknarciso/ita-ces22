package e3Clock;

public class time {
	private int hour;
	private int minute;
	time() {};
	public void setHour(int h){
		hour = h;
		System.out.println("Hour set to: "+hour);
	}
	public void setMinute(int m){
		minute = m;
		System.out.println("Minute set to: "+minute);
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public static void main(String arg[]){
		time t = new time();
		//t.hour = 3;
		//t.minute = 25;
		t.setHour(3);
		t.setMinute(25);
		System.out.println("The time now is "+t.getHour()+":"+t.getMinute());
	}
}
