package matrixfilling.combine;

import java.util.Scanner;
import matrixfilling.data.ReadData;
import matrixfilling.logic.FillMatrix;
import matrixfilling.output.OutputResult;

public class PerformTask6 {
	
	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		FillMatrix fillMatrix = new FillMatrix();
		OutputResult outputResult = new OutputResult();
		try {
			readData.setN(scanner);
			readData.setArrayOfNumbers(scanner);
			double[][] result = fillMatrix.getMatrix(readData.getArrayOfNumbers());
			outputResult.printResult(result);
		}
		catch (Exception e) {
			throw e;
		}
	}
}
