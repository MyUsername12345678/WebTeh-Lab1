package sequence.data;

import java.util.Scanner;
import readdata.ReaderData;

public class ReadData {
	
	ReaderData readerData = new ReaderData();
	
	public void setN(Scanner scanner) {
		this.n = readerData.setIntValue("n = ", scanner);
	}
	
	public void setM(Scanner scanner) {
		this.m = readerData.setIntValue("m = ", scanner);
	}

	public void setArrayOfNumbersN(Scanner scanner) {
		this.arrayOfNumbersN = readerData.setIntArray("Enter numbers \n", n, scanner);
	}
	
	public void setArrayOfNumbersM(Scanner scanner) {
		this.arrayOfNumbersM = readerData.setIntArray("Enter numbers \n", n, scanner);
	}

	public int[] getArrayOfNumbersN() {
		return arrayOfNumbersN;
	}
	
	public int[] getArrayOfNumbersM() {
		return arrayOfNumbersM;
	}
	
	public int getN() {
		return n;
	}
	
	public int getM() {
		return m;
	}
	
	private int n;
	private int m;
	private int[] arrayOfNumbersN;
	private int[] arrayOfNumbersM;

}