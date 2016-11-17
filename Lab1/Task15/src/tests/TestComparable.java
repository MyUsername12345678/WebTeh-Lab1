package tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Book;

public class TestComparable {
	
	TreeSet<Book> sortedBooks;
	
	@Before
	public void init() {
		sortedBooks  = new TreeSet<Book>();
	}
	
	@After
	public void tearDown() {
		sortedBooks = null;
	}
	
	private Book[] addBooks() {
		Book[] books = new Book[7];
		books[0] = new Book("Martin Eden", "Jack London", 15, 3, 1890035);
		books[1] = new Book("The Little Lady of the Big House", "Jack London", 25, 5, 3000258);
		books[2] = new Book("Oliver Twist", "Charles Dickens", 7, 1, 1581581);
		books[3] = new Book("American Notes", "Charles Dickens", 50, 3, 6666666);
		books[4] = new Book("Three Men in a Boat", "Jerome K. Jerome", 33, 3, 9999999);
		books[5] = new Book("Memoirs of Sherlock Holmes", "Arthur Conan Doyle", 90, 3, 9090909);
		books[6] = new Book("The Gambler", "Fyodor Dostoevsky", 85, 9, 2525252);
		return books;
	}
	
	@Test
	public void testIsbn() {
		Book[] btest = addBooks();
		sortedBooks.addAll(new ArrayList<Book>(Arrays.asList(btest)));
		Book[] actual = new Book[sortedBooks.size()];
		actual = sortedBooks.toArray(actual);
		Book[] expected = {btest[2], btest[0], btest[6], btest[1], btest[3], btest[5], btest[4]};
		assertTrue(Arrays.equals(actual, expected));
	}
	
	

}
