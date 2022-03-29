package calc.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMultiplyComplete extends InitialRequrements{

	@Test
	public void testMultiply() {
		int res = calculator.multiply(10, 2);
		assertEquals(20, res);
	}

}
