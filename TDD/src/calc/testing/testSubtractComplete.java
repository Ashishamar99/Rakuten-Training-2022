package calc.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSubtractComplete extends InitialRequrements{

	@Test
	public void testSubtract() {
		int res = calculator.subtract(10, 5);
		assertEquals(5, res);
	}

}
