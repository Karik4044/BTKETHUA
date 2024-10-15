public class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, int yearPublished, String author, String isbn) {
        super(title, yearPublished);
        this.author = author;
        this.isbn = isbn;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public void getDetails(){
        System.out.println("Title: " + this.getTitle() + ", yearPublished: " + this.getYearPublished() + ", Author: " + author+ ", Isbn: " + isbn);
    }
}
