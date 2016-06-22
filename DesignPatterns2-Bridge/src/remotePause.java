public class remotePause extends remote{
	
	public remotePause(device newDevice) {
		super(newDevice);
	}
	
	public void extraPressed() {
		System.out.println("Pausado");
	}
}