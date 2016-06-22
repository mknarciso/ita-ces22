public abstract class remote{
	private device theDevice;
	public remote(device newDevice){
		theDevice = newDevice;
	}
	public int getState() {return theDevice.getState();}
	public int getVolume() {return theDevice.getVolume();}
	public void leftPressed() {theDevice.leftPressed();}
	public void rightPressed() {theDevice.rightPressed();}
	public void upPressed() {theDevice.upPressed();}
	public void downPressed() {theDevice.downPressed();}
	public void feedback(){	theDevice.feedback();}
	public abstract void extraPressed();
	
}