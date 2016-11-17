package funccalculator.logic;

import java.util.ArrayList;

public class FindFunctionValues {

	public double[][] FindValuesXY(double a, double b, double h) {
		return findValueY(findValueX(a, b, h));
	}
	
	private double[] findValueX(double a, double b, double h) {
		ArrayList<Double> listX = new ArrayList<>();
		for (double x = a; x <= b; x += h) 
			listX.add(x);
		double[] arrayX = new double[listX.size()];
		for (int i = 0; i < arrayX.length; i++) {
			arrayX[i] = listX.get(i).doubleValue();
		}
		return arrayX;
	}
	
	private double[][] findValueY(double[] arrayX) {
		final int SIZE_X_Y = 2;
		final int INDEX_X = 0;
		final int INDEX_Y = 1;
		int sizeOfArray = arrayX.length;
		double[][] arrayXY = new double[sizeOfArray][SIZE_X_Y];
		for (int i = 0; i < sizeOfArray; i++) {
			arrayXY[i][INDEX_X] = arrayX[i];
			arrayXY[i][INDEX_Y] = getFunctionValue(arrayX[i]);
		}
		return arrayXY;
	}
	
	private double getFunctionValue (double x){
		return Math.tanh(x);
	}
}
