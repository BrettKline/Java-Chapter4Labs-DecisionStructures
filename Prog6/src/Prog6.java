import java.util.Scanner;
public class Prog6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much does your package weigh in kilograms?");
		ShippingCharges myPackage = new ShippingCharges(input.nextDouble());
		System.out.println("How far does it need to ship?");
		System.out.printf("Your package will cost $%.2f to ship.", myPackage.getShippingCharge(input.nextDouble()));
		input.close();
		
	}

}
