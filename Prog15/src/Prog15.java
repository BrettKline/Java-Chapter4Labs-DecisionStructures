import java.util.Scanner;
public class Prog15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many books did you buy?");
		int books = input.nextInt();
		switch (books) {
		case 0:
			System.out.println("You earned 0 points.");
			break;
		case 1:
			System.out.println("You earned 5 points.");
			break;
		case 2:
			System.out.println("You earned 15 points.");
			break;
		case 3:
			System.out.println("You earned 30 points.");
			break;
		default:
			break;
		}
		if (books < 0) {
			System.out.println("You earned -9001 points. Also you're a bad person.");
		}
		if (books >= 4) {
			System.out.println("You earned 60 points.");
		}
		input.close();
	}

}
