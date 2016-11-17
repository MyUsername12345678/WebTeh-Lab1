package shell;

import java.util.Scanner;
import shell.combine.PerformTask7;

public class MainClassOfShell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformTask7 performTask7 = new PerformTask7();
		Scanner scanner = new Scanner(System.in);
		try {performTask7.calculateAndOutput(scanner);}
		catch (Exception e){
			System.out.println("Ошибка" + e);
		}
		finally {
			scanner.close();
			performTask7 = null;
		}
	}
}

