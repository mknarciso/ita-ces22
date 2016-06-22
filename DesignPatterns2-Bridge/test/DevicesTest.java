import static org.junit.Assert.*;

import org.junit.Test;

public class DevicesTest {

	@Test
	public void test() {
		remote theTV = new remoteMute(new TV(1, 200));
		remote theTV2 = new remotePause(new TV(1, 150));
		remote theDVD = new remotePause(new DVD(1,14));

		System.out.println("Tv com controle com Mudo");
		
		theTV.rightPressed();
		theTV.upPressed();
		theTV.extraPressed();
		theTV.feedback();
		assertEquals(2,theTV.getState());
		
		System.out.println("\nTV com controle com Pause");
		
		theTV2.rightPressed();
		theTV2.upPressed();
		theTV2.upPressed();
		theTV2.upPressed();
		theTV2.upPressed();
		theTV2.extraPressed();
		theTV2.feedback();
		assertEquals(4,theTV2.getVolume());
		
		System.out.println("\nDVD");
		
		theDVD.rightPressed();
		theDVD.rightPressed();
		theDVD.rightPressed();
		theDVD.rightPressed();
		theDVD.upPressed();
		theDVD.extraPressed();
		theDVD.feedback();
		assertEquals(5,theDVD.getState());
		
	}
	
}