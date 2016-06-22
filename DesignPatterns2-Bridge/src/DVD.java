
public class DVD  extends device {
	
	public DVD(int newChapter, int newMaxChapter){
		state = newChapter;
		maxSetting = newMaxChapter;
	}
	
	public void leftPressed() {
		System.out.println("Next Chapter");
		state--;
	}

	public void rightPressed() {
		System.out.println("Previous Chapter");
		state++;
	}
	
}
