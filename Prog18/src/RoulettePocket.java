
public class RoulettePocket {
	private int number;
	private String color;

	public RoulettePocket(int number) {
		this.number = number;
		switch (number) {
		case 0:
			color = "Green";
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 12:
		case 14:
		case 16:
		case 18:
		case 19:
		case 21:
		case 23:
		case 25:
		case 27:
		case 30:
		case 32:
		case 34:
		case 36:
			color = "Red";
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
		case 11:
		case 13:
		case 15:
		case 17:
		case 20:
		case 22:
		case 24:
		case 26:
		case 28:
		case 29:
		case 31:
		case 33:
		case 35:
			color = "Black";
			break;
		default:
			color = "None";
			break;
		}
	}

	public int getNumber() {
		return number;
	}

	public String getColor() {
		return color;
	}
	
	
}
