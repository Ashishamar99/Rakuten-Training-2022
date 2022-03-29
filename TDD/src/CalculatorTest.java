import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	// Convention for writing test cases is write a failing test case, correct it and then write a passing testcase.
	@Test
	public void testAdd() {
		// The 3 A's of testing. 
		// A-> Arrange, A-> Act, A-> Assert
		Calculator calc = new Calculator(); //Arrange
		int res = calc.add(1, 2); //Act
		assertEquals(3, res); //Assert
	}
	
	@Test
	public void testAddWithZero() {
		Calculator calc = new Calculator();
		int res = calc.add(0, 2);
		assertEquals(2, res);
	}

}
