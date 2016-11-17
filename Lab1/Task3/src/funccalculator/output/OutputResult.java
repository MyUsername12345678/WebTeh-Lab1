package funccalculator.output;

public class OutputResult {

	public void printResult(double[][] arrayXY) {
		final int INDEX_X = 0;
		final int INDEX_Y = 1;
		System.out.printf("%4s%7s\n", "x", "tg(x)");
		for (int i = 0; i < arrayXY.length; i++) {
			printStringXY(arrayXY[i][INDEX_X], arrayXY[i][INDEX_Y]); 
		}
	}
	
	private void printStringXY(double x, double y) {
		System.out.printf("%5.2f%5.2f\n", x, y);;
	}
}
