package sequence;

import java.util.Scanner;

import sequence.combine.PerformTask8;

public class MainClassOfSequenceCombiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformTask8 performTask8 = new PerformTask8();
		Scanner scanner = new Scanner(System.in);
		try {performTask8.calculateAndOutput(scanner);}
		catch (Exception e){
			System.out.println("Ошибка" + e);
		}
		finally {
			scanner.close();
			performTask8 = null;
		}
	}
}

