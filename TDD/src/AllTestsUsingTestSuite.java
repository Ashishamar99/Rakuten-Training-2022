import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calc.programs.CalculatorTest;
import calc.testing.testAddComplete;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class, testAddComplete.class, testArrayList.class})


/* WE WILL ADD ALL THE REQUIRED MULTIPLE TEST CASE FILES
 * UNDER THE ANNOTATION "SuiteClasses" and run this single test suite
 * to run all the test cases at ONCE!!!!! */


public class AllTestsUsingTestSuite {

}
