
public class MonthDays {
	private int month;
	private boolean isLeapYear;
	
	public MonthDays(int month, int year) {
		this.month = month;
		
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				isLeapYear = true;
			}
			else {
				isLeapYear = false;
			}
		}
		else if (year % 4 == 0) {
			isLeapYear = true;
		}
		else {
			isLeapYear = false;
		}
	}
	
	public int getDaysInMonth() {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear ? 29 : 28;
		default:
			return -1;
		}
	}
}
