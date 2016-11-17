package calculateexp;

import java.util.Scanner;

import calculateexp.combine.PerformTask1;

public class MainClassOfCalculateExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformTask1 performTask1 = new PerformTask1();
		Scanner scanner = new Scanner(System.in);
		try {performTask1.calculateAndOutput(scanner);}
		catch(Exception e) {System.out.println("Ошибка" + e);}
		finally {
			scanner.close();
			performTask1 = null;
		}
	}

}
