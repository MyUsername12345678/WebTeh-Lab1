package deleter.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import deleter.logic.DeleteNumbers;

public class TestDeleter {

	DeleteNumbers deleteNumbers;
	
	@Before
	public void init() {
		deleteNumbers = new DeleteNumbers();
	}
	
	@After
	public void tearDown() {
		deleteNumbers = null;
	}
	
	@Test
	public void testSequenceUp() {
		int actual = deleteNumbers.findCountNumbersToDelete(new int[]{2, 5, 6, 9, 15});
		int expected = 0;
		assertTrue (actual == expected);
	}
	
	@Test
	public void testNumbers() {
		int actual = deleteNumbers.findCountNumbersToDelete(new int[]{2, 99, 6, 9, 18, 10});
		int expected = 2;
		assertTrue (actual == expected);
	}
	
	@Test
	public void testSequenceDown() {
		int actual = deleteNumbers.findCountNumbersToDelete(new int[]{15, 9, 6, 5, 2});
		int expected = 4;
		assertTrue (actual == expected);
	}

}
