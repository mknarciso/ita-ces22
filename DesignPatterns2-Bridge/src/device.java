abstract class device {
	
	public int state;
	public int maxSetting;
	public int volume = 0;
	public abstract void leftPressed();
	public abstract void rightPressed();
	
	public int getState(){ return state; }
	public int getVolume(){ return volume; }
	
	public void feedback() {
		if(state > maxSetting || state < 0) { state = 0; }
		System.out.println("Canal " + state);
	}
	
	public void upPressed() {
		volume++;
		System.out.println("Volume: " + volume);
	}
	
	public void downPressed() {
		volume--;
		System.out.println("Volume: " + volume);
		
	}
	
}
