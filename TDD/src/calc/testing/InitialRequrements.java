package calc.testing;


import org.junit.Before;
import calc.programs.*;

public class InitialRequrements {
	
	public Calculator calculator;
	@Before
	public void init() {
		calculator = new Calculator();
	}

}
