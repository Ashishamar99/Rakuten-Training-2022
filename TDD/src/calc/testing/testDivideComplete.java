package calc.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDivideComplete extends InitialRequrements{

	@Test
	public void testDivide() {
		float res = calculator.divide(10, 5);
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
		float res = calculator.divide(10, 0);
		assertEquals(Double.POSITIVE_INFINITY, res, 1);
	}

}
