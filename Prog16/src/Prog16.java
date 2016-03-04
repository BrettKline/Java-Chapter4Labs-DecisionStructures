import java.util.Scanner;
public class Prog16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a day, then a month, then the last two digits of a year (all as integers, please)");
		MagicDate myMagicDate = new MagicDate(input.nextInt(), input.nextInt(), input.nextInt());
		if (myMagicDate.isMagicDate()) {
			System.out.println("It's a magic date!");
		}
		else {
			System.out.println("It's not a magic date.");
		}
		input.close();
	}

}
