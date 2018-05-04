package src.main;

public class Book {
	
	private String bookId;
	
	private String title;
	
	private String author;
	
	private double avgrating;
	
	private String category;
	
	public Book() {
		
	}

	public Book(String bookId, String title, String author, double avgrating, String category) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.avgrating = avgrating;
		this.category = category;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getAvgrating() {
		return avgrating;
	}

	public void setAvgrating(double avgrating) {
		this.avgrating = avgrating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
