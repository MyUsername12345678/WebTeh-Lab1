package deleter.combine;

import java.util.Scanner;

import deleter.data.ReadData;
import deleter.logic.DeleteNumbers;
import deleter.output.OutputResult;

public class PerformTask5 {
	
	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		DeleteNumbers deleteNumbers = new DeleteNumbers();
		OutputResult outputResult = new OutputResult();
		try {
			readData.setN(scanner);
			readData.setArrayOfNumbers(scanner);
			int result = deleteNumbers.findCountNumbersToDelete(readData.getArrayOfNumbers());
			outputResult.printResult(result);
		}
		catch (Exception e) {
			throw e;
		}
	}
}
