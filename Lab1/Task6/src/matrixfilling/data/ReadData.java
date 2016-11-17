package matrixfilling.data;

import java.util.Scanner;
import readdata.ReaderData;

public class ReadData {
	
	ReaderData readerData = new ReaderData();
	
	public void setN(Scanner scanner) {
		this.n = readerData.setIntValue("n = ", scanner);
	}

	public void setArrayOfNumbers(Scanner scanner) {
		this.arrayOfNumbers = readerData.setDoubleArray("Enter numbers \n", n, scanner);
	}

	public double[] getArrayOfNumbers() {
		return arrayOfNumbers;
	}
	
	private int n;
	private double[] arrayOfNumbers;

}