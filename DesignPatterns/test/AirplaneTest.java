/* Useful for teste, while not abstract
 * 
 * 
 * import static org.junit.Assert.*;

import org.junit.Test;

public class AirplaneTest {

	@Test
	public void testGetBrand() {
		Airplane p100 = new Airplane();
		p100.setBrand("Embraer");
		p100.getBrand();
		assertEquals(p100.getBrand(),"Embraer");
	}

	@Test
	public void testAirplaneIntro() {
		Airplane p100 = new Airplane();
		p100.setBrand("Embraer");
		p100.setName("Phenom");
		p100.setModel(100);
		p100.setSeats(8);
		p100.setMaxSpeed(400);
		p100.airplaneIntro();
		assertEquals(p100.getAirplaneIntro(),"This is the new Embraer Phenom 100, it flies at maximum 400.0 knots, and takes 8 passengers!");
	}

}*/
