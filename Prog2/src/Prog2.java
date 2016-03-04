import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many seconds (as in units of time)?");

		int inputInt = input.nextInt();
		
		if (inputInt < 60) {
			System.out.printf("There is/are %d second(s) in %d second(s). But you probably already knew that.\r\n", inputInt, inputInt);
		}
		if (inputInt >= 60) {
			System.out.printf("There is/are %d minute(s) in %d second(s).\r\n", inputInt / 60, inputInt);
		}
		if (inputInt >= 3600) {
			System.out.printf("There is/are %d hour(s) in %d second(s).\r\n", inputInt / 3600, inputInt);
		}
		if (inputInt >= 86400) {
			System.out.printf("There is/are %d day(s) in %d second(s).\r\n", inputInt / 86400, inputInt);
		}

		input.close();
	}

}
