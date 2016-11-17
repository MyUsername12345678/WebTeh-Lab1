package funccalculator.combine;

import java.util.Scanner;

import funccalculator.data.ReadData;
import funccalculator.logic.FindFunctionValues;
import funccalculator.output.OutputResult;

public class PerformTask3 {
	
	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		FindFunctionValues findFunctionValues = new FindFunctionValues();
		OutputResult outputResult = new OutputResult();
		try {
			readData.setA(scanner);
			readData.setB(scanner);
			readData.setH(scanner);
			double[][] result = findFunctionValues.FindValuesXY(readData.getA(), readData.getB(), readData.getH());
			outputResult.printResult(result);
		}
		catch (Exception e) {
			throw e;
		}
	}
}
