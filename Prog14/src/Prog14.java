import java.util.Scanner;
public class Prog14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the month and year?");
		MonthDays myMonthDays = new MonthDays(input.nextInt(), input.nextInt());
		
		System.out.printf("There are %d days in that month.", myMonthDays.getDaysInMonth());
		input.close();
	}

}
