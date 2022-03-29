import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc;
	@Before //Add this annotation to run this method before every test case.
	public void init() {
		calc = new Calculator(); //Arrange
	}

	// Convention for writing test cases is write a failing test case, correct it and then write a passing testcase.
	@Test
	public void testAdd() {
		// The 3 A's of testing. 
		// A-> Arrange, A-> Act, A-> Asserts
		int res = calc.add(1, 2); //Act
		assertEquals(3, res); //Assert
	}
	
	@Test
	public void testAddWithZero() {
		int res = calc.add(0, 2);
		assertEquals(2, res);
	}
	
	@Test
	public void testSubtract() {
		int res = calc.subtract(10, 5);
		assertEquals(5, res);
	}
	
	@Test
	public void testDivide() {
		float res = calc.divide(10, 5);
		assertEquals(2.0, res, 1);
	}
	
	/**
	 * @Test
	 * 	public void testDivideWithZero() {
	 * 	float res = calc.divide(10, 0);
	 * 	assertEquals(Double.POSITIVE_INFINITY, res, 1);
	 * 		}
	 *	}
	 *
	 * WE USE "expected" with the "Test" attribute to check for any expected exceptions.
	 * USE WITHOUT OPENJDK18, AS OPENJDK18 gives divide by 0 as infinity.  
**/
	
	
	@Test
	public void testDivideWithZero() {
		float res = calc.divide(10, 0);
		assertEquals(Double.POSITIVE_INFINITY, res, 1);
	}
	
	@Test
	public void testMultiply() {
		int res = calc.multiply(10, 2);
		assertEquals(20, res);
	}
	
}
