package shell.logic;

public class SortShell {
	
	public double[] getSortedArray(double[] arrayOfNumbers) {
		int preLastNumber = arrayOfNumbers.length - 2;
		for (int i = 0; i <= preLastNumber; ) {
			if (arrayOfNumbers[i] > arrayOfNumbers[i+1]) {
				arrayOfNumbers = exchangeNumbersInArray(arrayOfNumbers, i, i + 1);
				if (i > 0) {
					i--;
				}
			}
			else {
				i++;
			}	
		}
		return arrayOfNumbers;
	}
	
	private double[] exchangeNumbersInArray(double[] arrayOfNumbers, int i, int j) {
		double x = arrayOfNumbers[i];
		arrayOfNumbers[i] = arrayOfNumbers[j];
		arrayOfNumbers[j] = x;
		return arrayOfNumbers;
	}

}
