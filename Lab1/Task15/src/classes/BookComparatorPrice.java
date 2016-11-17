package classes;

import java.util.Comparator;

public class BookComparatorPrice implements Comparator<Book> {

	public int compare(Book book1, Book book2) {
		if (book1.getPrice() > book2.getPrice()) 
			return 1;
		if (book1.getPrice() == book2.getPrice())
			return 0;
		return -1;
	}
	
}
