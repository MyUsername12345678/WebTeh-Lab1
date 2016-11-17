package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import org.apache.commons.collections.CollectionUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primenums.logic.EratosthenesPrimeNumbers;

public class TestEratosthenes {

	EratosthenesPrimeNumbers eratosthenesPrimeNumbers;
	
	@Before
	public void init() {
		eratosthenesPrimeNumbers = new EratosthenesPrimeNumbers();
	}

	@After
	public void tearDown() {
		eratosthenesPrimeNumbers = null;
	}
	
	@Test
	public void testPrimeNumbers() {
		HashSet<Integer> actual = eratosthenesPrimeNumbers.getPrimeNumbers(15);
		Integer[] expectedInt = {2, 3, 5, 7, 11, 13};
		HashSet<Integer> expected = new HashSet<Integer>();
		expected.addAll(Arrays.asList(expectedInt));
		assertTrue(CollectionUtils.isEqualCollection(expected, actual));
	}

}