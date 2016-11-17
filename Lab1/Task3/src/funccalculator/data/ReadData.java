package funccalculator.data;

import java.util.Scanner;
import readdata.ReaderData;

public class ReadData {

	ReaderData readerData = new ReaderData();
	
	public void setA(Scanner scanner) {
		this.a = readerData.setDoubleValue("a = ", scanner);
	}

	public void setB(Scanner scanner) {
		this.b = readerData.setDoubleValue("b = ", scanner);
	}
	
	public void setH(Scanner scanner) {
		this.h = readerData.setDoubleValue("h = ", scanner);
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public double getH() {
		return h;
	}
	
	private double a;
	private double b;
	private double h;

}