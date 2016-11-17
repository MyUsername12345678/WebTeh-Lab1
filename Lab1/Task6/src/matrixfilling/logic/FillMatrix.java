package matrixfilling.logic;

public class FillMatrix {

	public double[][] getMatrix(double[] arrayOfNumbers) {
		int n = arrayOfNumbers.length;
		double[][] matrix = new double[n][n];
		for (int i = 0; i < n; i++) {
			matrix[i] = getMovedArray(arrayOfNumbers, i);
		}
		return matrix;
	}
	
	private double[] getMovedArray(double[] arrayOfNumbers, int position) {
		int n = arrayOfNumbers.length;
		double[] resultArray = new double[n];
		for (int i = 0; i < n; i++) {
			int newIndex = (i + position) % n;
			resultArray[i] = arrayOfNumbers[newIndex];
		}
		return resultArray;
	}

}
