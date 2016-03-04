import java.util.Scanner;
public class Prog13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight (pounds) and height (inches)?");
		BMI myBMI = new BMI(input.nextDouble(), input.nextDouble());

		if (myBMI.calculateBMI() <= 18.5) {
			System.out.println("You are underweight.");
		}
		if (myBMI.calculateBMI() > 18.5 && myBMI.calculateBMI() < 25 ) {
			System.out.println("You are optimal weight.");
		}
		if (myBMI.calculateBMI() >= 25) {
			System.out.println("You are overweight.");
		}
		
		input.close();

	}

}
