
public class BMI {
	private double weight;
	private double height;
	
	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double calculateBMI() {
		
		return weight * (703 / (height * height));
	}
}
