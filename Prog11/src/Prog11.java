import java.util.Scanner;
public class Prog11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many minutes did you use, under which package? (A, B, or C)");
		double myMinutes = input.nextDouble();
		input.nextLine();
		String myPackage = input.nextLine();
		MobileBill myMobileBill = new MobileBill(myMinutes, myPackage);
		myMobileBill.calculateCharge();
		input.close();
	}

}
