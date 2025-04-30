import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {

    private String id;
    private String name;
    private List<Book> history;
    private List<Book> borrowedBooks;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        history = new ArrayList<>();
        borrowedBooks = new LinkedList<>();
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getHistory() {
        return history;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        history.add(book);
        borrowedBooks.add(book);
    }
}
