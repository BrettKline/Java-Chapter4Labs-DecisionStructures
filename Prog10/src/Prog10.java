import java.util.Scanner;
public class Prog10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What temperature is it? (In degrees F, assume 1 atmosphere of pressure)");
		Chem myChem = new Chem(input.nextDouble());
		myChem.calculateChems();
		input.close();

	}

}
