package lib.entities;

public class Book {
	
	String title;
	int year;
	String author;
	
	
	public Book(String title, int year, String author) {
		super();
		this.title = title;
		this.year = year;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public String getAuthor() {
		return author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
