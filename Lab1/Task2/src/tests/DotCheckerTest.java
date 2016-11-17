package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dotchecker.logic.DotCheck;;

public class DotCheckerTest {
	
	DotCheck dotCheck;
	
	@Before
	public void init() {
		dotCheck = new DotCheck();
	}

	@After
	public void tearDown() {
		dotCheck = null;
	}
	
	@Test
	public void testRightValues() {
		boolean result = dotCheck.checkDot(2, 2);
		assertTrue(result);
	}
	
	@Test
	public void testZeroValues() {
		boolean result = dotCheck.checkDot(0, 0);
		assertTrue(result);
	}
	
	@Test
	public void testExtremeValuesXm4Y5() {
		boolean result = dotCheck.checkDot(-4, 5);
		assertTrue(result);
	}
	
	@Test
	public void testExtremeValuesX4Y5() {
		boolean result = dotCheck.checkDot(4, 5);
		assertTrue(result);
	}
	
	@Test
	public void testExtremeValuesXm6Ym3() {
		boolean result = dotCheck.checkDot(-6, -3);
		assertTrue(result);
	}
	
	@Test
	public void testExtremeValuesX6Ym3() {
		boolean result = dotCheck.checkDot(6, -3);
		assertTrue(result);
	}
	
	@Test
	public void testWrongValuesX() {
		boolean result = dotCheck.checkDot(10, 2);
		assertFalse(result);
	}
	
	@Test
	public void testWrongValuesY() {
		boolean result = dotCheck.checkDot(2, 10);
		assertFalse(result);
	}
	
	@Test
	public void testWrongValuesXY() {
		boolean result = dotCheck.checkDot(10, 10);
		assertFalse(result);
	}

}
