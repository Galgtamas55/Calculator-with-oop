package calculatoroop;

public class Factorial extends AbstractLeaderClass{
protected Factorial(double...num) {
super(num);
}
@Override
	public double execute() {
	
	return 0;
	}
static long factorial(long n) {
	if (n == 0)
		return 1;

	return n * factorial(n - 1);

}
}
