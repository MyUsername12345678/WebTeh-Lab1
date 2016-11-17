package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primenums.logic.CheckPrimeNumbers;

public class TestPrimeNumbersInArray {

	CheckPrimeNumbers checkPrimeNumbers;
	
	@Before
	public void init() {
		checkPrimeNumbers = new CheckPrimeNumbers();
	}

	@After
	public void tearDown() {
		checkPrimeNumbers = null;
	}
	
	@Test
	public void testIndexes() {
		int[] actual = checkPrimeNumbers.getIndexesOfPrimeNumbers(new int[] {5, 6, 7, 1, 3});
		int[] expected = {1, 3, 5};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void testBigNumbers() {
		int[] actual = checkPrimeNumbers.getIndexesOfPrimeNumbers(new int[] {500, 1013, 700, 19, 3000});
		int[] expected = {2, 4};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void AllNumbersIsPrimary() {
		int[] actual = checkPrimeNumbers.getIndexesOfPrimeNumbers(new int[] {2, 3, 13, 7});
		int[] expected = {1, 2, 3, 4};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void AllNumbersIsTheSameAndPrimary() {
		int[] actual = checkPrimeNumbers.getIndexesOfPrimeNumbers(new int[] {5, 5, 5, 5});
		int[] expected = {1, 2, 3, 4};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void AllNumbersIsTheSameAndNotPrimary() {
		int[] actual = checkPrimeNumbers.getIndexesOfPrimeNumbers(new int[] {4, 4, 4, 4});
		int[] expected = {};
		assertArrayEquals(actual, expected);
	}
	

}
