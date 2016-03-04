import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		final double PACKAGE_COST = 99;
		Scanner input = new Scanner(System.in);
		System.out.println("How many software packages did you buy?");
		int numPackages = input.nextInt();
		double totalPrice = numPackages * PACKAGE_COST;
		double totalDiscount = 0;
		if ((numPackages >= 10) && (numPackages <= 19)) {
			totalDiscount += (PACKAGE_COST * (numPackages - 9)) * .20;
		}
		else if ((numPackages >= 20) && (numPackages <= 49)) {
			totalDiscount += (PACKAGE_COST * (10)) * .20;
			totalDiscount += (PACKAGE_COST * (numPackages - 19)) * .30;
		}
		else if ((numPackages >= 50) && (numPackages <= 99)) {
			totalDiscount += (PACKAGE_COST * (10)) * .20;
			totalDiscount += (PACKAGE_COST * (30)) * .30;
			totalDiscount += (PACKAGE_COST * (numPackages - 49)) * .40;
		}
		else if (numPackages >= 100) {
			totalDiscount += (PACKAGE_COST * (10)) * .20;
			totalDiscount += (PACKAGE_COST * (30)) * .30;
			totalDiscount += (PACKAGE_COST * (50)) * .40;
			totalDiscount += (PACKAGE_COST * (numPackages - 99)) * .50;
		}
		System.out.printf("You paid $%.2f for your software packages (and saved $%.2f on an undiscounted price of $%.2f).", totalPrice - totalDiscount, totalDiscount, totalPrice);

		input.close();
	}
	
}
