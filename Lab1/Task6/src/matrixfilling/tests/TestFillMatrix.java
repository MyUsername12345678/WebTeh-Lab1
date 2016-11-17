package matrixfilling.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import matrixfilling.logic.FillMatrix;

public class TestFillMatrix {

	FillMatrix fillMatrix;
	
	@Before
	public void init() {
		fillMatrix = new FillMatrix();
	}
	
	@After
	public void tearDown() {
		fillMatrix = null;
	}
	
	@Test
	public void testEvenCountNumbers() {
		double[] arrayOfNumbers = new double[]{5, 7, 10, 13};
		double[][] actual = fillMatrix.getMatrix(arrayOfNumbers);
		double[][] expected = new double[][]{{5, 7, 10, 13},
										 	 {7, 10, 13, 5},
										 	 {10, 13, 5, 7},
										 	 {13, 5, 7, 10}
										 	};
		assertArrayEquals(actual, expected);									 	
	}
	
	@Test
	public void test2CountNumbers() {
		double[] arrayOfNumbers = new double[]{5, 7};
		double[][] actual = fillMatrix.getMatrix(arrayOfNumbers);
		double[][] expected = new double[][]{{5, 7},
										 	 {7, 5}
										 	};
		assertArrayEquals(actual, expected);									 	
	}
	
	@Test
	public void testUnevenCountNumbers() {
		double[] arrayOfNumbers = new double[]{5, 7, 9};
		double[][] actual = fillMatrix.getMatrix(arrayOfNumbers);
		double[][] expected = new double[][]{{5, 7, 9},
										 	 {7, 9, 5},
										 	 {9, 5, 7}
										 	};
		assertArrayEquals(actual, expected);									 	
	}
	
	@Test
	public void testDoubleNumbers() {
		double[] arrayOfNumbers = new double[]{5.5, 7.3, 9.2};
		double[][] actual = fillMatrix.getMatrix(arrayOfNumbers);
		double[][] expected = new double[][]{{5.5, 7.3, 9.2},
										 	 {7.3, 9.2, 5.5},
										 	 {9.2, 5.5, 7.3}
										 	};
		assertArrayEquals(actual, expected);									 	
	}

}
