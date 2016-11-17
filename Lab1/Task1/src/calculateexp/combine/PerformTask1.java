package calculateexp.combine;

import java.util.Scanner;

import calculateexp.data.ReadData;
import calculateexp.logic.CalculateExpression;
import calculateexp.output.OutputResult;

public class PerformTask1 {

	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		CalculateExpression calculateExpression = new CalculateExpression();
		OutputResult outputResult = new OutputResult();
		readData.setX(scanner);
		readData.setY(scanner);
		double result = calculateExpression.calculate(readData.getX(), readData.getY());
		outputResult.printResult(result);
	}
	
}
