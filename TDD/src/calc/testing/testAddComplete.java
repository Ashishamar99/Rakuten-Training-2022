package calc.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddComplete extends InitialRequrements{

	@Test
	public void testAdd() {
		int res = calculator.add(1, 2);
		assertEquals(3, res);
	}
	
	@Test
	public void testAddWithZero() {
		int res = calculator.add(0, 2);
		assertEquals(2, res);
	}

}
