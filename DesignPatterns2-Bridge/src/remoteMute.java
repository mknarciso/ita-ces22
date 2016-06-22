public class remoteMute extends remote{
	
	public remoteMute(device newDevice) {
		super(newDevice);
	}
	
	public void extraPressed() {
		
		System.out.println("TV em mudo");
		
	}
	
}