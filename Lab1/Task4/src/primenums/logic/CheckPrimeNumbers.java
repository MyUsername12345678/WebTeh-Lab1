package primenums.logic;

import java.util.Arrays;
import java.util.HashSet;

import primenums.logic.EratosthenesPrimeNumbers;

public class CheckPrimeNumbers {

	public int[] getIndexesOfPrimeNumbers(int[] arrayOfNumbers) {
		EratosthenesPrimeNumbers eratosthenesPrimeNumbers = new EratosthenesPrimeNumbers();
		HashSet<Integer> primeNumbersSet = eratosthenesPrimeNumbers.getPrimeNumbers(getMaxNumber(arrayOfNumbers));
		eratosthenesPrimeNumbers = null;
		int[] resultIndexes = new int[arrayOfNumbers.length];
		int count = 0;
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			if (primeNumbersSet.contains(arrayOfNumbers[i])) {
				resultIndexes[count] = i+1;
				count++;
			}
		}
		resultIndexes = Arrays.copyOf(resultIndexes, count);
		return resultIndexes;
	}

	private int getMaxNumber(int[] arrayOfNumbers) {
		int max = 0;
		for (int i: arrayOfNumbers) {
			max = (i > max)? i: max;
		}
		return max;
	}
}
