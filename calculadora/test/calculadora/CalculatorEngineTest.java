package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorEngineTest {

	@Test
	public void testDigit() throws Exception {
		System.out.println("Testing Digit input:\n Will input 5, then will input 7, expect 57");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(5);
		engine.add();
		engine.digit(7);
		engine.compute();
		assertEquals(12,engine.display());
	}
	
	@Test
	public void testAdd() {
		System.out.println("Testing Add operation:\n Will input 5, then add with 7, expect 12.");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(5);
		assertEquals(5,engine.display());
		engine.digit(7);
		assertEquals(57,engine.display());
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
