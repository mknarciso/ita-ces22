package e3Clock;

public class time {
	private int hour;
	private int minute;
	time() {};
	public void setHour(int h){
		hour = h;
	}
	public void setMinute(int m){
		minute = m;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public void setTime(int h, int m){
		hour = h;
		minute = m;
	}
	public void printTime(){
		System.out.println("The time now is "+hour+":"+minute);
	}
	public static void main(String arg[]){
		time t = new time();
		//t.hour = 3;
		//t.minute = 25;
		t.setHour(3);
		t.setMinute(25);
		t.printTime();
		t.setTime(22, 35);
		t.printTime();
	}
}
