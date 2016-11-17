package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import funccalculator.logic.FindFunctionValues;

import org.junit.After;
import org.junit.Before;;

public class TestFunctionCalculator {
	
	FindFunctionValues findFunctionValues;
	
	@Before
	public void init() {
		findFunctionValues = new FindFunctionValues();
	}

	@After
	public void tearDown() {
		findFunctionValues = null;
	}
	
	@Test
	public void testRightValues() {
		double[][] actual = findFunctionValues.FindValuesXY(0, 45, 45);
		double[][] expected = {{0,0},{45,1}};
		assertArrayEquals(actual, expected);
	}
		
	@Test
	public void testArrayLength() {
		int actual = (findFunctionValues.FindValuesXY(0, 100, 0.5)).length;
		int expected = 201;
		assertTrue(actual == expected);
	}
	
	@Test
	public void testWrongParametrH() {
		int actual = (findFunctionValues.FindValuesXY(0, 100, 200)).length;
		int expected = 1;
		assertTrue(actual == expected);
	}
	
	@Test
	public void testWrongParametrB() {
		int actual = (findFunctionValues.FindValuesXY(1000, 100, 200)).length;
		int expected = 0;
		assertTrue(actual == expected);
	}
	
}
