import java.util.Scanner;
public class Prog18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("There are 37 pockets on a roulette table, 0 through 36. Enter a number to get its color.");
		int number = input.nextInt();
		RoulettePocket myRoulettePocket = new RoulettePocket(number);
		String pocketColor = myRoulettePocket.getColor();
		if (pocketColor.equals("None")) {
			System.out.println("That's not a number that appears on a roulette table.");
		}
		else {
			System.out.printf("The pocket %d is colored %s.", number, pocketColor);
		}
		input.close();
	}

}
