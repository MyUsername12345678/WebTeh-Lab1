package tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Test;

import classes.Book;
import classes.BookComparatorAuthor;
import classes.BookComparatorPrice;
import classes.BookComparatorTitle;

public class TestComparator {

	TreeSet<Book> sortedBooks;
		
	@After
	public void tearDown() {
		sortedBooks = null;
	}
	
	private Book[] addBooks() {
		Book[] books = new Book[9];
		books[0] = new Book("Martin Eden", "Jack London", 15, 3, 1890035);
		books[1] = new Book("The Little Lady of the Big House", "Jack London", 25, 5, 3000258);
		books[2] = new Book("Oliver Twist", "Charles Dickens", 7, 1, 1581581);
		books[3] = new Book("American Notes", "Unknown", 50, 3, 6666666);
		books[4] = new Book("Three Men in a Boat", "Jerome K. Jerome", 33, 3, 9999999);
		books[5] = new Book("Memoirs of Sherlock Holmes", "Arthur Conan Doyle", 90, 3, 9090909);
		books[6] = new Book("The Gambler", "Fyodor Dostoevsky", 85, 9, 2525252);
		books[7] = new Book("American Notes", "Charles Dickens", 50, 3, 6666666);
		books[8] = new Book("American Notes", "Unknown", 30, 3, 7878787);
		return books;
	}
	
	@Test
	public void testTitle() {
		Comparator<Book> bcomp = new BookComparatorTitle();
		final int[] INDEXES = {3, 0, 5, 2, 6, 1, 4};
		Book[] actual = getActual(bcomp);
		Book[] expected = getExpected(INDEXES);
		assertTrue(Arrays.equals(actual, expected));
	}
	
	@Test
	public void testTitleThenAuthor() {
		Comparator<Book> bcomp = new BookComparatorTitle().thenComparing(new BookComparatorAuthor());
		final int[] INDEXES = {7, 3, 0, 5, 2, 6, 1, 4};
		Book[] actual = getActual(bcomp);
		Book[] expected = getExpected(INDEXES);
		assertTrue(Arrays.equals(actual, expected));
	}
	
	@Test
	public void testAuthorThenTitle() {
		Comparator<Book> bcomp = new BookComparatorAuthor().thenComparing(new BookComparatorTitle());
		final int[] INDEXES = {5, 7, 2, 6, 0, 1, 4, 3};
		Book[] actual = getActual(bcomp);
		Book[] expected = getExpected(INDEXES);
		assertTrue(Arrays.equals(actual, expected));
	}
	
	@Test
	public void testAuthorThenTitleThenPrice() {
		Comparator<Book> bcomp = new BookComparatorAuthor().thenComparing(new BookComparatorTitle());
		bcomp = bcomp.thenComparing(new BookComparatorPrice());
		final int[] INDEXES = {5, 7, 2, 6, 0, 1, 4, 8, 3};
		Book[] actual = getActual(bcomp);
		Book[] expected = getExpected(INDEXES);
		assertTrue(Arrays.equals(actual, expected));
	}
	
	private Book[] getActual(Comparator<Book> bComp) {
		sortedBooks = new TreeSet<Book>(bComp);
		Book[] btest = addBooks();
		sortedBooks.addAll(new ArrayList<Book>(Arrays.asList(btest)));
		Book[] actual = new Book[sortedBooks.size()];
		actual = sortedBooks.toArray(actual);
		return actual;
	}
	
	private Book[] getExpected (int[] indexesRight) {
		Book[] expected = new Book[indexesRight.length];
		Book[] btest = addBooks();
		for (int i = 0; i < expected.length; i++) {
			expected[i] = btest[indexesRight[i]];
		}
		return expected;
	}

}
