import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> listOfBooks = new LinkedList<>();
    
    public void addBook(Book book) {
        listOfBooks.add(book);
        System.out.println("You have added a book.");
    }

    public void displayAvailableBooks() {
        for(Book book : listOfBooks){
            System.out.println(book.getTitle());
        }
    }
}
