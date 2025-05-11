public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean isAvailable;

    public Book(String title, String author, int pageCount, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isAvailable = isAvailable;
    }

    boolean isThick() {
        if (pageCount > 300) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getTitle() {
        return title;
    }

    boolean isAvailable() {
        if (isAvailable) {
            System.out.println("The book is available.");
        } else {
            System.out.println("The book is not available.");
        }
        return isAvailable;
    }

    public void borrowBook() {
        isAvailable = false;
        System.out.println("You have borrowed the book.");
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned the book.");
    }
}
