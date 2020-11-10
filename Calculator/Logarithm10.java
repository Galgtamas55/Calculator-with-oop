package calculatoroop;

public class Logarithm10 extends AbstractLeaderClass {
	protected Logarithm10(double... num) {
		super(num);
	}

	@Override
	public double execute() {
		double log = 0;
		int i = 0;
		while (i < num.length) {
			log = Math.log10(num[i++]);
		}
		return log;
	}
}
