public class LibraryItem {
    private String title;
    private int yearPublished;

    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }
    public String getTitle(){
        return title;
    }
    public int getYearPublished(){
        return yearPublished;
    }
}
