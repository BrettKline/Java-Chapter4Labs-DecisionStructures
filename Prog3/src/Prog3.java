import java.util.Scanner;
public class Prog3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What were your three test scores?");
		TestScores myTest = new TestScores(input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.printf("Your letter grade is a(n) %c.", myTest.getLetterGrade());
		

		input.close();
	}

}
