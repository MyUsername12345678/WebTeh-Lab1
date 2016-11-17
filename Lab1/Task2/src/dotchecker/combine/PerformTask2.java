package dotchecker.combine;

import java.util.Scanner;

import dotchecker.data.ReadData;
import dotchecker.logic.DotCheck;
import dotchecker.output.OutputResult;

public class PerformTask2 {

	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		DotCheck dotCheck = new DotCheck();
		OutputResult outputResult = new OutputResult();
		readData.setX(scanner);
		readData.setY(scanner);
		boolean result = dotCheck.checkDot(readData.getX(), readData.getY());
		outputResult.printResult(result);
	}
}
