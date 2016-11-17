package readdata;

import java.util.Scanner;

public class ReaderData {

	public int setIntValue(String explainingText, Scanner scanner) {
		System.out.print(explainingText);
		int x = scanner.nextInt();
		return x;
	}

	public double setDoubleValue(String explainingText, Scanner scanner) {
		System.out.print(explainingText);
		double x = scanner.nextDouble();
		return x;
	}

	public int[] setIntArray(String explainingText, int n, Scanner scanner) {
		System.out.print(explainingText);
		int[] resultArray = new int[n];
		for (int i = 0; i < n; i++) {
			resultArray[i] = setIntValue("", scanner);
		}
		return resultArray;
	}

	public double[] setDoubleArray(String explainingText, int n, Scanner scanner) {
		System.out.print(explainingText);
		double[] resultArray = new double[n];
		for (int i = 0; i < n; i++) {
			resultArray[i] = setDoubleValue("", scanner);
		}
		return resultArray;
	}
}
