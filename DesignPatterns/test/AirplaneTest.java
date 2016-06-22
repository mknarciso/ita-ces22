import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;

public class AirplaneTest {
	@Test
	public void testE190() {
		
		//Static test
		Embraer Factory0 = new Embraer();
		Airplane firstPlane = null;
		firstPlane = Factory0.makeAirplane("E190");
		firstPlane.airplaneIntro();
		assertEquals(190,firstPlane.getModel());
		assertEquals(95,firstPlane.getSeats());

	}
	@Test
	public void testP200() {
		
		//Static test
		Embraer Factory0 = new Embraer();
		Airplane firstPlane = null;
		firstPlane = Factory0.makeAirplane("P200");
		firstPlane.airplaneIntro();
		assertEquals("Phenom",firstPlane.getName());
		assertEquals(12,firstPlane.getSeats());

	}
}
