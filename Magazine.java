public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publisher;

    public Magazine(String title, int yearPublished, int issueNumber, String publisher){
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }
    public int getIssueNumber(){
        return issueNumber;
    }
    public String getPublisher(){
        return publisher;
    }
    public void getDetails() {
        System.out.println("Title: " + this.getTitle() + ", yearPublished: " + this.getYearPublished() + ", issuenNumber: " + issueNumber + ", publisher: " + publisher);
    }

}
