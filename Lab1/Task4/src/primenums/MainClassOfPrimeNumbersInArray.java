package primenums;

import java.util.Scanner;
import primenums.combine.PerformTask4;

public class MainClassOfPrimeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		PerformTask4 performTask4 = new PerformTask4();
		Scanner scanner = new Scanner(System.in);
		try {performTask4.calculateAndOutput(scanner);}
		catch(Exception e) {System.out.println("Ошибка" + e);}
		finally {
			scanner.close();
			performTask4 = null;
		}
	}

}
