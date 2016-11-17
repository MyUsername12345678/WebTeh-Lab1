package classes;

public class Book {
	
	@Override
	public int hashCode() {
		int result = price * edition;
		result += title.length() + author.length();
		return result;
	}
	
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
		return true;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "title " + title;
		result += "author " + author;
		result += "price " + price;
		result += "edition " + edition;
		return result;
	}
	
	@Override
	public Object clone() {
		Book cloneBook = new Book();
		cloneBook.setAuthor(this.author);
		cloneBook.setEdition(Book.edition);
		cloneBook.setPrice(this.price);
		cloneBook.setTitle(this.title);
		return cloneBook;
	}
	
	private String title;
	private String author;
	private int price;
	private static int edition;
	
}
