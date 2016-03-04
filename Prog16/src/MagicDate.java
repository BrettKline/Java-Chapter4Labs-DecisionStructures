
public class MagicDate {
	private int day;
	private int month;
	private int year;
	
	public MagicDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isMagicDate() {
		if (day * month == year) {
			return true;
		}
		else {
			return false;
		}
	}
}
