
public class Chem {
	private double temperature;

	private final double ETHYL_FREEZE = -173;
	private final double ETHYL_BOIL = 172;
	private final double OXYGEN_FREEZE = -362;
	private final double OXYGEN_BOIL = -306;
	private final double WATER_FREEZE = 32;
	private final double WATER_BOIL = 212;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public Chem(double temperature) {
		this.temperature = temperature;
	}

	public boolean isEthylFreezing() {
		
		return (temperature <= ETHYL_FREEZE ? true : false);
	}

	public boolean isEthylBoiling() {
		
		return (temperature >= ETHYL_BOIL ? true : false);
	}

	public boolean isOxygenFreezing() {
		
		return (temperature <= OXYGEN_FREEZE ? true : false);
	}

	public boolean isOxygenBoiling() {
		
		return (temperature >= OXYGEN_BOIL ? true : false);
	}

	public boolean isWaterFreezing() {
		
		return (temperature <= WATER_FREEZE ? true : false);
	}

	public boolean isWaterBoiling() {
		
		return (temperature >= WATER_BOIL ? true : false);
	}
	
	public void calculateChems() {
		if (isEthylBoiling()) {
			System.out.println("Ethyl Alcohol will boil. (Gas)");
		}
		if (isEthylFreezing()) {
			System.out.println("Ethyl Alcohol will freeze. (Solid)");
		}
		if (!isEthylBoiling() && !isEthylFreezing()) {
			System.out.println("Ethyl Alcohol will neither freeze nor boil. (Liquid)");
		}
		if (isOxygenBoiling()) {
			System.out.println("Oxygen will boil. (Gas)");
		}
		if (isOxygenFreezing()) {
			System.out.println("Oxygen will freeze. (Solid)");
		}
		if (!isOxygenBoiling() && !isOxygenFreezing()) {
			System.out.println("Oxygen will neither freeze nor boil. (Liquid)");
		}
		if (isWaterBoiling()) {
			System.out.println("Water will boil. (Gas)");
		}
		if (isWaterFreezing()) {
			System.out.println("Water will freeze. (Solid)");
		}
		if (!isWaterBoiling() && !isWaterFreezing()) {
			System.out.println("Water will neither freeze nor boil. (Liquid)");
		}
	}
}
