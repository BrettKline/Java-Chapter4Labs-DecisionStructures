
public class MobileBill {
	private double minutesUsed;
	private String packageChoice;
	
	public MobileBill(double minutesUsed, String packageChoice) {
		this.minutesUsed = minutesUsed;
		this.packageChoice = packageChoice;
	}
	
	public void calculateCharge() {

		double overflowA = .45 * (minutesUsed - 450);
		overflowA = overflowA < 0 ? 0 : overflowA;
		double overflowB = .40 * (minutesUsed - 900);
		overflowB = overflowB < 0 ? 0 : overflowB;
		double trueCostA = 39.99 + overflowA;
		double trueCostB = 59.99 + overflowB;
		double trueCostC = 69.99;
		switch (packageChoice) {
		case "a":
		case "A":
			if (trueCostA > trueCostB) {
				System.out.printf("You would have saved $%.2f under package B.\r\n", trueCostA - trueCostB);
			}
			if (trueCostA > trueCostC) {
				System.out.printf("You would have saved $%.2f under package C.\r\n", trueCostA - trueCostC);
			}
			System.out.printf("Your mobile bill is $%.2f.\r\n", trueCostA);
			break;
		case "b":
		case "B":
			if (trueCostB > trueCostC) {
				System.out.printf("You would have saved $%.2f under package C.\r\n", trueCostB - trueCostC);
			}
			System.out.printf("Your mobile bill is $%.2f.\r\n", trueCostB);
			break;
		case "c":
		case "C":
			System.out.printf("Your mobile bill is $%.2f.\r\n", trueCostC);
			break;
		default:
			System.out.println("You did not specify a real package. Reboot the program and specify a proper package.");
			break;
		}
	}
	
}
