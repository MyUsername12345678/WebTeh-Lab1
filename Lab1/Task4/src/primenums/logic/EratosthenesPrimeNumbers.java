package primenums.logic;

import java.util.Arrays;
import java.util.HashSet;

public class EratosthenesPrimeNumbers {

	public HashSet<Integer> getPrimeNumbers(int maxNumber) {
		maxNumber = maxNumber + 1;
		boolean[] isPrime = new boolean[maxNumber];
		Arrays.fill(isPrime,true);
		for (int i=2; i*i < maxNumber; i++)
		   if (isPrime[i])
		      for (int j=i*i; j < maxNumber; j+=i)
		         isPrime[j] = false;
		HashSet<Integer> primeNumbersSet = new HashSet<Integer>();
		for (int i = 2; i < maxNumber; i++) {
			if (isPrime[i])
				primeNumbersSet.add(i);
		}
		return primeNumbersSet;
	}
}
