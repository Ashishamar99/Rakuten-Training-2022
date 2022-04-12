
public class GravityCalculator {
	/*
	 * Initial output -
	 * 
	 * The object's position after 10.0 seconds is 0.0m.
	 */
	public static void main(String[] args) {
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;

		finalPosition = calculateFinalPosition(gravity, fallingTime, initialVelocity, initialPosition);
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + "m.");
	}

	private static double calculateFinalPosition(double gravity, double fallingTime, double initialVelocity,
			double initialPosition) {
		double resultPosition = 0.5 * (gravity * Math.pow(fallingTime, 2)) + (initialVelocity * fallingTime)
				+ initialPosition;
		return resultPosition;
	}
}
