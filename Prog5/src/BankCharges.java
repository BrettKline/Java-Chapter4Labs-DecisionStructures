
public class BankCharges {
	private double endingBalance;
	private int checksWritten;
	private double serviceFees;
	
	public BankCharges(double endingBalance, int checksWritten) {
		this.endingBalance = endingBalance;
		this.checksWritten = checksWritten;
		serviceFees += 10;
		if (checksWritten < 20) {
			serviceFees += .10 * checksWritten;
		}
		else if (checksWritten >= 20 && checksWritten < 40) {
			serviceFees += .08 * checksWritten;
		}
		else if (checksWritten >= 40 && checksWritten < 60) {
			serviceFees += .06 * checksWritten;
		}
		else if (checksWritten >= 60) {
			serviceFees += .04 * checksWritten;
		}
		if (endingBalance < 400) {
			serviceFees += 15;
		}
		
	}

	public double getEndingBalance() {
		return endingBalance;
	}

	public int getChecksWritten() {
		return checksWritten;
	}

	public double getServiceFees() {
		return serviceFees;
	}
}
