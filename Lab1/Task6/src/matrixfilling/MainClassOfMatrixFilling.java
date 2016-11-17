package matrixfilling;

import java.util.Scanner;
import matrixfilling.combine.PerformTask6;

public class MainClassOfMatrixFilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformTask6 performTask6 = new PerformTask6();
		Scanner scanner = new Scanner(System.in);
		try {performTask6.calculateAndOutput(scanner);}
		catch (Exception e){
			System.out.println("Ошибка" + e);
		}
		finally {
			scanner.close();
			performTask6 = null;
		}
	}
}

