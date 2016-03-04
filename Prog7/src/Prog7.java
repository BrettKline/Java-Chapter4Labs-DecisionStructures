import java.util.Scanner;
public class Prog7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many calories is your food, and how many grams of fat does it contain?");
		FatGram myFood = new FatGram(input.nextDouble(), input.nextDouble());
		myFood.calculateFatGrams();

		
		input.close();
	}

}
