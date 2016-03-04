import java.util.Scanner;
public class Prog8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("I have a lot of input for you to do!\r\nWhat are the three times, then the three names, of three runners in a race?");
		double time1 = input.nextDouble(), time2 = input.nextDouble(), time3 = input.nextDouble();
		input.nextLine();
		String name1 = input.nextLine(), name2 = input.nextLine(), name3 = input.nextLine();
		Runners myRunners = new Runners(time1, time2, time3, name1, name2, name3);
		System.out.printf("%s got first place, %s got second place, and %s got third place.", myRunners.getFirstPlace(), myRunners.getSecondPlace(), myRunners.getThirdPlace());
		input.close();
	}

}
