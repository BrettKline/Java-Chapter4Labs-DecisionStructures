
public class SoundSpeed {
	private double distance;

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public SoundSpeed(double distance) {
		this.distance = distance;
	}

	public double getSpeedInAir() {
		
		return distance / 1100;
	}
	public double getSpeedInWater() {
		
		return distance / 4900;
	}
	public double getSpeedInSteel() {
		
		return distance / 16400;
	}
}
