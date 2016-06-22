package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorEngineTest {
	
	@Test
	public void testDigit() {
		System.out.println("Testing Digit input: Will input 5, then will input 7, expect 57");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(5);
		assertEquals(5,engine.display());
		engine.digit(7);
		assertEquals(57,engine.display());
	}
	
	@Test
	public void testClear() {
		System.out.println("Testing Clear operation: Will input 5, then clear, expect 0.");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(5);
		assertEquals(5,engine.display());
		engine.clear();
		assertEquals(0,engine.display());
	}

	@Test
	public void testAdd() throws Exception {
		System.out.println("Testing Add operation: Will input 5, then add with 7, expect 12.");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(5);
		engine.add();
		engine.digit(7);
		engine.compute();
		assertEquals(12,engine.display());
	}


	@Test
	public void testSubtract() throws Exception  {
		System.out.println("Testing Subtract operation: Will input 7, then subtract 5, expect 2.");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(7);
		assertEquals(7,engine.display());
		engine.subtract();
		engine.digit(5);
		engine.compute();
		assertEquals(2,engine.display());
	}

	@Test
	public void testMultiply() throws Exception  {
		System.out.println("Testing Multiply operation: Will input 7, then multiply by 5, expect 35.");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(7);
		assertEquals(7,engine.display());
		engine.multiply();
		engine.digit(5);
		engine.compute();
		assertEquals(35,engine.display());
	}

	@Test
	public void testDivide() throws Exception  {
		System.out.println("Testing Divide operation: Will input 8, then divide by 4, expect 2.");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(8);
		assertEquals(8,engine.display());
		engine.divide();
		engine.digit(4);
		engine.compute();
		assertEquals(2,engine.display());
	}

    @Test(expected=Exception.class) 
    public void divideByZeroTest() throws Exception  {
		System.out.println("Testing Divide by zero: Will input 8, then divide by zero, expect exception.");
		CalculatorEngine engine = new CalculatorEngine();
		engine.digit(8);
		assertEquals(8,engine.display());
		engine.divide();
		engine.digit(0);
		engine.compute();
     }
}
