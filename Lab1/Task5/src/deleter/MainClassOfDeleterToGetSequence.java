package deleter;

import java.util.Scanner;
import deleter.combine.PerformTask5;

public class MainClassOfDeleterToGetSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformTask5 performTask5 = new PerformTask5();
		Scanner scanner = new Scanner(System.in);
		try {performTask5.calculateAndOutput(scanner);}
		catch (Exception e){}
		finally {
			scanner.close();
			performTask5 = null;
		}
	}
}

