/*
 * WE WILL PUT AN INPUT VALIDATION CODE HERE AND CALL THIS EVERYTIME.
 */
public class Utility {
	static void validateRowInput(int row) {
		
		if(row <= 0) {
			throw new IllegalArgumentException("Row value should be greater than 0");
		}
		
	}
}
