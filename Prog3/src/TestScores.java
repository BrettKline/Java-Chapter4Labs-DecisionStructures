
public class TestScores {
	private double test1;
	private double test2;
	private double test3;
	
	public TestScores(double test1, double test2, double test3) {
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}

	public double getTest1() {
		return test1;
	}

	public double getTest2() {
		return test2;
	}

	public double getTest3() {
		return test3;
	}
	
	public double getAverage() {
		return (test1 + test2 + test3) / 3;
	}
	
	public char getLetterGrade() {
		double testAverage = getAverage();
		if ((testAverage <= 100) && testAverage >= 90) {
			return 'A';
		}
		if ((testAverage < 90) && testAverage >= 80) {
			return 'B';
		}
		if ((testAverage < 80) && testAverage >= 70) {
			return 'C';
		}
		if ((testAverage < 70) && testAverage >= 60) {
			return 'D';
		}
		if (testAverage < 60) {
			return 'F';
		}
		else {
			return 'I';
		}
	}
}
