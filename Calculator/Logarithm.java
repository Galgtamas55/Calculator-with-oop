package calculatoroop;


public class Logarithm extends AbstractLeaderClass {
public Logarithm(double...num) {
	super(num);
}
@Override
	public double execute() {
	double log = 0;
	int i = 0;
	while (i < num.length) {
		log = Math.log(num[i++]);
	}
	return log;
	}
}
