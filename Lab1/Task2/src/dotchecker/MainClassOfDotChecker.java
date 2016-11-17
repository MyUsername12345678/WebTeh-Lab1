package dotchecker;

import java.util.Scanner;

import dotchecker.combine.PerformTask2;

public class MainClassOfDotChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformTask2 performTask2 = new PerformTask2();
		Scanner scanner = new Scanner(System.in);
		try {performTask2.calculateAndOutput(scanner);}
		catch(Exception e) {System.out.println("Ошибка" + e);}
		finally {
			scanner.close();
			performTask2 = null;
		}
	}

}
