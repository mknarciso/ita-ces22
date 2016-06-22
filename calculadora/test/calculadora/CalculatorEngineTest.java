package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorEngineTest {

	@Test
	public void testDigit() {
		System.out.println("Testing Digit input:\n Will input 5, then will input 7, expect 57\n");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(5);
		System.out.println(engine.display());
		assertEquals(5,engine.display());
		engine.digit(7);
		System.out.println(engine.display());
		assertEquals(57,engine.display());
	}
	
	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
