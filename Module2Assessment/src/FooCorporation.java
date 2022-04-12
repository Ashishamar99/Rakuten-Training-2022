
public class FooCorporation {
	public static void main(String[] args) {
		calculatePay(7.5, 35);
		calculatePay(8.20, 47);
		calculatePay(10.0, 73);
		calculatePay(8.00, 41);
	}

	private static void calculatePay(double basePay, int hoursWorked) {
		double totalPay = 0.0;
		if (basePay < 8.0) {
			System.out.println("Error: Base pay cannot be less than 8$.");
		} else if (hoursWorked > 60) {
			System.out.println("Error: Worker should work for a maximum of 60 hrs");
		} else if (hoursWorked > 40) {
			int overtime = hoursWorked - 40;
			totalPay = (40 * (basePay)) + (overtime * basePay * 1.5);
			System.out.println("Total Pay = " + totalPay);
		} else {
			totalPay = hoursWorked * basePay;
			System.out.println("Total Pay = " + totalPay);
		}
	}
}
