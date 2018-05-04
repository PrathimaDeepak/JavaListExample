package src.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestListDemo {
	
	public static void main(String[] args) {
		
		//creating an Arraylist of Books
		List<Book> listOfBooks = new ArrayList<Book>();
		
		//adding books to arrayList
		listOfBooks.addAll(addFictionBooks());
		listOfBooks.addAll(addClassicBooks());
		listOfBooks.addAll(addRomanticBooks());
		
		//printing the book at the 3rd and 5th position
		System.out.println("Printing details of 3rd and 5th books");
		printBookDetails(listOfBooks.get(2));
		printBookDetails(listOfBooks.get(4));
		
		//updating the book with ID F101
		System.out.println("\nUpdating book with id F101");
		listOfBooks.set(0, new Book("F101", "Master of the Game", "Sidney Sheldon", 4.8, "Fiction"));
		printBookDetails(listOfBooks.get(0));
		
		//sort books
		sortBooks(listOfBooks);
				
		//printing all book details
		System.out.println("\nPrinting details of all books after sorting");
		listOfBooks.stream().forEach(book -> {
			printBookDetails(book);
		});
		
		//removing a book
		System.out.println("\nDeleting the 7th book");
		listOfBooks.remove(6);
		listOfBooks.stream().forEach(book -> {
			printBookDetails(book);
		});
		
		
	}
	
	private static List<Book> addFictionBooks(){
		List<Book> fictionBooks = new ArrayList<Book>();
		fictionBooks.add(new Book("F101", "Master of the Game", "Sidney Sheldon", 4.5, "Fiction"));
		fictionBooks.add(new Book("F102", "Life is What you Make it", "Preeti Shenoy", 3.8, "Fiction"));
		fictionBooks.add(new Book("F103", "Blood Sisters","Jane Corry", 3.85, "Fiction"));
		return fictionBooks;
	}
	
	private static List<Book> addClassicBooks(){
		List<Book> classicBooks = new ArrayList<Book>();
		classicBooks.add(new Book("C201", "Oliver Twist", "Charles Dickens", 4.2, "Classics"));
		classicBooks.add(new Book("C202", "Pride and Prejudice", "Jane Austen", 4.25, "Classics"));
		classicBooks.add(new Book("C203", "Northanger Abbey", "Jane Austen", 3.5, "Classics"));
		return classicBooks;
	}
	
	private static List<Book> addRomanticBooks(){
		List<Book> romanticBooks = new ArrayList<Book>();
		romanticBooks.add(new Book("R301", "Walk to Remember", "Nicholas Sparks", 4.15, "Romantic"));
		romanticBooks.add(new Book("R302", "The Fault in our Stars", "John Green", 4.2, "Romantic"));
		romanticBooks.add(new Book("R303", "Dear John", "Nicholas Sparks", 4, "Romantic"));
		return romanticBooks;
	}
	
	private static void printBookDetails(Book book) {
		System.out.println("Book ID: " + book.getBookId() + " Title: " + book.getTitle() + " Author: " + book.getAuthor() + " AvgRating: " + book.getAvgrating() + " Category: " + book.getCategory());
	}
	
	private static List<Book> sortBooks(List<Book> listOfBooks){
		Comparator<Book> bookComparator =
			    (Book b1, Book b2)->b1.getBookId().compareTo(b2.getBookId());
		listOfBooks.sort(bookComparator);
		return listOfBooks;
	}

}
