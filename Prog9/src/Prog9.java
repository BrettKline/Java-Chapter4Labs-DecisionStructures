import java.util.Scanner;
public class Prog9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How far (in feet) did your sound wave reach?"); 
		SoundSpeed mySound = new SoundSpeed(input.nextDouble());
		double soundTime;
		System.out.println("Would you like to calculate for the speed of sound in (A)ir, (W)ater, or (S)teel?");
		input.nextLine();
		switch (input.nextLine()) {
		case "1":
		case "A":
		case "a":
		case "air":
		case "Air": 
			soundTime = mySound.getSpeedInAir();
			break;
		case "2":
		case "W":
		case "w":
		case "water":
		case "Water": 
			soundTime = mySound.getSpeedInWater();
			break;
		case "3":
		case "S":
		case "s":
		case "steel":
		case "Steel": 
			soundTime = mySound.getSpeedInSteel();
			break;
		default:
			soundTime = -1;
			break;
		}
		
		if (soundTime == -1) {
			System.out.println("Your input did not make sense. Please reboot the program.");
		}
		else {
			System.out.printf("Your sound wave took %.2f seconds to go %.2f feet.", soundTime, mySound.getDistance());
		}
		input.close();
		
	}

}
