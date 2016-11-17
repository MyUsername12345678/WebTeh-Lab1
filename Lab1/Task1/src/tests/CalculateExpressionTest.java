package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculateexp.logic.CalculateExpression;

public class CalculateExpressionTest {

	CalculateExpression calculateExpression;

	@Before
	public void init() {
		calculateExpression = new CalculateExpression();
	}

	@After
	public void tearDown() {
		calculateExpression = null;
	}

	@Test
	public void testCalculation() {
		double actual = calculateExpression.calculate(0, 0);
		double expected = 0.5;
		assertTrue(actual == expected);
	}

}
