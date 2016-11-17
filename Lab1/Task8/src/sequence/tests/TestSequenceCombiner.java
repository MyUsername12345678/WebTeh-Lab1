package sequence.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sequence.logic.CombinateSequences;;

public class TestSequenceCombiner {

	CombinateSequences combinateSequences;
	
	@Before
	public void init() {
		combinateSequences = new CombinateSequences();
	}
	
	@After
	public void tearDown() {
		combinateSequences = null;
	}
	
	@Test
	public void testSequence() {
		int[] arrayN = new int[]{1, 3, 5, 6, 8};
		int[] arrayM = new int[]{2, 4, 7, 8, 12};
		int[] actual = combinateSequences.getIndexesToPaste(arrayN, arrayM);
		int[] expected = new int[]{2, 3, 5, 6, 6};
		assertTrue(Arrays.equals(actual, expected));		
	}
	
	@Test
	public void testSequenceBMoreA() {
		int[] arrayN = new int[]{1, 3, 5, 6, 8};
		int[] arrayM = new int[]{10, 10, 10, 10};
		int[] actual = combinateSequences.getIndexesToPaste(arrayN, arrayM);
		int[] expected = new int[]{6, 6, 6, 6};
		assertTrue(Arrays.equals(actual, expected));		
	}
	
}
