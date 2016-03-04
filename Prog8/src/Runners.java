
public class Runners {
	private double time1;
	private double time2;
	private double time3;
	private String name1;
	private String name2;
	private String name3;
	public Runners(double time1, double time2, double time3, String name1, String name2, String name3) {
		this.time1 = time1;
		this.time2 = time2;
		this.time3 = time3;
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
	}
	
	public String getFirstPlace() {
		if (time1 <= time2 && time1 <= time3) {
			return name1;
		}
		else if (time2 <= time1 && time2 <= time3) {
			return name2;
		}
		else if (time3 <= time1 && time3 <= time2) {
			return name3;
		}
		else {
			return "I don't know who";
		}
	}
	
	public String getSecondPlace() {
		if ((time1 <= time2 && time1 >= time3) || (time1 >= time2 && time1 <= time3)) {
			return name1;
		}
		else if ((time2 <= time1 && time2 >= time3) || (time2 >= time1 && time2 <= time3)) {
			return name2;
		}
		else if ((time3 <= time1 && time3 >= time2) || (time3 >= time1 && time3 <= time2)) {
			return name3;
		}
		else {
			return "I don't know who";
		}
		
	}
	
	public String getThirdPlace() {
		if (time1 >= time2 && time1 >= time3) {
			return name1;
		}
		else if (time2 >= time1 && time2 >= time3) {
			return name2;
		}
		else if (time3 >= time1 && time3 >= time2) {
			return name3;
		}
		else {
			return "I don't know who";
		}
	}
}
