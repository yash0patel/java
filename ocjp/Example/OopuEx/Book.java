package OopuEx;

public class Book {
//	5. Write a Java program to create a class called "Book"
//	with attributes for title, author, and ISBN, 
//	and methods to add and remove books from a collection.
	private String title;
    private String author;
    private String isbn;
    private int i = 0;
    StringBuilder[] sb = new StringBuilder[3];
    
    public Book(String title, String author, String isbn) 
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        sb[i].append(title + " " + author + " " + isbn);
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void removeTitle(String title) {
//        sb[]
    }

    public void removeAuthor(String author) {
        this.author = author;
    }

    public void removeIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public static void main(String[] args) {
		Book b = new Book("MyBook","xyz","1234567899876");
		b.setAuthor("abc");
		
    }
}
