package calculateexp.logic;

public class CalculateExpression {

	public double calculate(double x, double y) {
		try {
			double result;
			result = 1 + Math.sin(x + y) * Math.sin(x + y);
			result /= 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
			result += x;
			return result;
		} catch (ArithmeticException e) {
			System.out.println("Exception");
			return -1;
		}
	}

}
