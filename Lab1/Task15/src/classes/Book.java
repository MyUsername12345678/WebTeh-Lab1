package classes;

public class Book implements Comparable<Book> {

	public int compareTo(Book other) {
		if (this.isbn > other.isbn)
			return 1;
		if (this.isbn < other.isbn)
			return -1;
		return 0;
	}
	
	public Book(String title, String author, int price, int edition, int isbn) {
		setTitle(title);
		setAuthor(author);
		setPrice(price);
		setEdition(edition);
		setIsbn(isbn);
	}
	
	public Book() {}

	public int getPrice(){
		return price;
	}
	
	public int getEdition(){
		return edition;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getIsbn(){
		return isbn;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void setEdition(int edition){
		Book.edition = edition;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setIsbn(int isbn){
		this.isbn = isbn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book))
			return false;
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (!this.title.equals(other.getTitle()))
			return false;
		if (!this.author.equals(other.getAuthor()))
			return false;
		if (price != other.getPrice())
			return false;
		if (edition != other.getEdition())
			return false;
		if (isbn != other.getIsbn())
			return false;
		return true;
	}
		
	private String title;
	private String author;
	private int price;
	private static int edition;
	private int isbn;
	
}
