package sequence.combine;

import java.util.Scanner;

import sequence.data.ReadData;
import sequence.logic.CombinateSequences;
import sequence.output.OutputResult;

public class PerformTask8 {

	public void calculateAndOutput(Scanner scanner) {
		ReadData readData = new ReadData();
		CombinateSequences combinateSequences = new CombinateSequences();
		OutputResult outputResult = new OutputResult();
		readData.setN(scanner);
		readData.setArrayOfNumbersN(scanner);
		readData.setM(scanner);
		readData.setArrayOfNumbersM(scanner);
		int[] result = combinateSequences.getIndexesToPaste(readData.getArrayOfNumbersN(), readData.getArrayOfNumbersM());
		outputResult.printResult(result);
	}
}
