
public class FatGram {
	private final int CAL_PER_FATGRAM = 9;
	private double numCalories;
	private double numFatGrams;
	private boolean isLowFat;
	
	public FatGram(double numCalories, double numFatGrams) {
		this.numCalories = numCalories;
		this.numFatGrams = numFatGrams;
		if (numCalories * .30 > (numFatGrams * CAL_PER_FATGRAM)) {
			this.isLowFat = true;
		}
		else {
			this.isLowFat = false;
		}
	}
	
	public double calculateFatGrams() {
		double fatPercent = ((numFatGrams * CAL_PER_FATGRAM) / numCalories);
		if (fatPercent > 1) {
			System.out.println("The food is more than 100% fat, which is impossible.");
			return -1;
		}
		else {
			System.out.printf("This food is %.2f percent fat. This food is %slow-fat.", fatPercent, isLowFat ? "" : "not ");
			return fatPercent;
		}
	}
}
