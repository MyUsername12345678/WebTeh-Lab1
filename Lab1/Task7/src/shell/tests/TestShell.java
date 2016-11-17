package shell.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import shell.logic.SortShell;;

public class TestShell {

	SortShell sortShell;
	
	@Before
	public void init() {
		sortShell = new SortShell();
	}
	
	@After
	public void tearDown() {
		sortShell = null;
	}
	
	@Test
	public void testPlusNumbers() {
		double[] arrayOfNumbers = new double[]{500, 15, 180, 1000, 33};
		double[] actual = sortShell.getSortedArray(arrayOfNumbers);
		double[] expected = new double[]{15, 33, 180, 500, 1000};
		assertTrue(Arrays.equals(actual, expected));
		
	}
	
	@Test
	public void testMinusNumbers() {
		double[] arrayOfNumbers = new double[]{-500, -15, -180, -1000, -33};
		double[] actual = sortShell.getSortedArray(arrayOfNumbers);
		double[] expected = new double[]{-1000, -500, -180, -33, -15};
		assertTrue(Arrays.equals(actual, expected));
	}
	
	@Test
	public void testRealNumbers() {
		double[] arrayOfNumbers = new double[]{-500.4, 15.15, -180.66, 1000, -33};
		double[] actual = sortShell.getSortedArray(arrayOfNumbers);
		double[] expected = new double[]{-500.4, -180.66, -33, 15.15, 1000};
		assertTrue(Arrays.equals(actual, expected));
	}
	
	@Test
	public void testSameNumbers() {
		double[] arrayOfNumbers = new double[]{0, 0, 0, 0, 0};
		double[] actual = sortShell.getSortedArray(arrayOfNumbers);
		double[] expected = new double[]{0, 0, 0, 0, 0};
		assertTrue(Arrays.equals(actual, expected));
	}
	
	@Test
	public void test2SameNumbers() {
		double[] arrayOfNumbers = new double[]{5, -5, 5, -5, 5};
		double[] actual = sortShell.getSortedArray(arrayOfNumbers);
		double[] expected = new double[]{-5, -5, 5, 5, 5};
		assertTrue(Arrays.equals(actual, expected));
	}

}
