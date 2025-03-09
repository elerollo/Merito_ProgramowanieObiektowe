public class Book {
    private String title;
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    boolean isThick() {
        if (pageCount > 300) {
            return true;
        }
        else {
            return false;
        }
    }
}
