package calc.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import calc.programs.*;

public class InitialRequrements {
	
	public Calculator calculator;
	@Before
	public void init() {
		calculator = new Calculator();
	}

}
