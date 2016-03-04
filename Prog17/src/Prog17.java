import java.util.Scanner;
public class Prog17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cookout time! How many people are coming, and how many hotdogs will each person get?");
		Cookout myCookout = new Cookout(input.nextInt(), input.nextInt());
		System.out.printf("You will need %d hotdog packs and %d bun packs. There will be %d hotdogs left over and %d buns.", myCookout.getHotdogPacksRequired(), myCookout.getBunPacksRequired(), myCookout.getLeftoverHotdogs(), myCookout.getLeftoverBuns());
		input.close();
	}

}
