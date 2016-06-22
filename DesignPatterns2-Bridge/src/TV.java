
public class TV  extends device {
	
	public TV(int newChannel, int newMaxChannel){
		state = newChannel;
		maxSetting = newMaxChannel;
	}
	
	public void leftPressed() {
		System.out.println("Channel Down");
		state--;
	}

	public void rightPressed() {
		System.out.println("Channel Up");
		state++;
	}
	
}
