package shell.output;

public class OutputResult {

	public void printResult(double[] result) {
		for (double num : result)
				System.out.printf("%6.2f", num);
		}	
	
}

