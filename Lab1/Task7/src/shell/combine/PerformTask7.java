package shell.combine;

import java.util.Scanner;

import shell.data.ReadData;
import shell.logic.SortShell;
import shell.output.OutputResult;

public class PerformTask7 {

	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		SortShell sortShell = new SortShell();
		OutputResult outputResult = new OutputResult();
		readData.setN(scanner);
		readData.setArrayOfNumbers(scanner);
		double[] result = sortShell.getSortedArray(readData.getArrayOfNumbers());
		outputResult.printResult(result);
	}
}
