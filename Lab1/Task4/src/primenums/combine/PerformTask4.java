package primenums.combine;

import java.util.Scanner;

import primenums.data.ReadData;
import primenums.logic.*;
import primenums.output.OutputResult;

public class PerformTask4 {
	
	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		CheckPrimeNumbers checkPrimeNumbers = new CheckPrimeNumbers();
		OutputResult outputResult = new OutputResult();
		try {
			readData.setN(scanner);
			readData.setArrayOfNumbers(scanner);
			int[] result = checkPrimeNumbers.getIndexesOfPrimeNumbers(readData.getArrayOfNumbers());
			outputResult.printResult(result);
		}
		catch (Exception e) {
			throw e;
		}
	}
}
