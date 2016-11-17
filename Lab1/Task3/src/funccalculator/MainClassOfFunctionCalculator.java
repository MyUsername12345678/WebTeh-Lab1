package funccalculator;

import java.util.Scanner;

import funccalculator.combine.PerformTask3;

public class MainClassOfFunctionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformTask3 performTask3 = new PerformTask3();
		Scanner scanner = new Scanner(System.in);
		try {performTask3.calculateAndOutput(scanner);}
		catch(Exception e) {System.out.println("Ошибка " + e);}
		finally {
			scanner.close();
			performTask3 = null;
		}
	}
}

