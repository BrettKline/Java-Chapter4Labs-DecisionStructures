import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your bank balance, then number of checks written?");
		BankCharges myBankCharges = new BankCharges(input.nextDouble(), input.nextInt());
		System.out.printf("For your ending balance of $%.2f and %d checks written, you owe the bank $%.2f in service fees.", myBankCharges.getEndingBalance(), myBankCharges.getChecksWritten(), myBankCharges.getServiceFees());
		input.close();
	}

}
