package matrixfilling.output;

public class OutputResult {

	public void printResult(double[][] result) {
		int n = result.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.printf("%6.2f", result[i][j]);
			System.out.println();
		}	
	}
	
}
