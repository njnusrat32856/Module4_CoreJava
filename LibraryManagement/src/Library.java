import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<String, Book> bookList;
    Map<String, User> userList;

    public Library() {
        bookList = new HashMap<>();
        userList = new HashMap<>();

    }

    public Map<String, Book> getBookList() {
        return bookList;
    }

    public User findUser(String userId) {
        return userList.get(userId);
    }

    public Book findBook(String bookId){
        return bookList.get(bookId);
    }

    public void borrow(User user, Book book){
        if (book.isBorrowed()){
            System.out.println("This book is not available.");
            return;
        }
        user.borrowBook(book);
        book.borrow();

        System.out.println(book.getName() + " Borrowed Successfully.");
    }

    public void addUser(User user){
        String userId = user.getId();
        userList.put(userId, user);
    }

    public void addBook(Book book){
        String bookId = book.getId();
        bookList.put(bookId, book);
    }
}
