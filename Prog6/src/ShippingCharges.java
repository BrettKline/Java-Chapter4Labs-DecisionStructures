
public class ShippingCharges {
	private double weight;

	public ShippingCharges(double weight) {
		this.weight = weight;
	}
	
	public double getShippingCharge(double distance) {
		double shipRate;
		if (weight <= 2) {
			shipRate = 1.1;
		}
		else if (weight > 2 && weight <= 6) {
			shipRate = 2.2;
		}
		else if (weight > 6 && weight <= 10) {
			shipRate = 3.7;
		}
		else if (weight > 10) {
			shipRate = 4.8;
		}
		else {
			shipRate = 4.8;
		}
		int nonProRate = ((int)distance / 500) + 1;
		return nonProRate * shipRate;
	}
}
