import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        User user1 = new User("u1", "Nusrat");
        User user2 = new User("u2", "Mubin");
        User user3 = new User("u3", "Jahan");

        Book book1 = new Book("1", "SQL Book");
        Book book2 = new Book("2", "Java Book");
        Book book3 = new Book("3", "Angular Book");

        library.addUser(user1);
        library.addUser(user2);
        library.addBook(book1);
        library.addBook(book2);

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Choose an option:\n " +
                    "1. Book List\n" +
                    "2. Borrow a book\n" +
                    "3. Return a book \n" +
                    "4. Show Borrowed List\n");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1: {
                    System.out.println("Book in our Library: \n" +
                            "ID \t Name \t Availability\n" +
                            "=====================");
                    for (Map.Entry<String, Book> bookMap : library.getBookList().entrySet()) {
                        Book book = bookMap.getValue();
                        String availablity = book.isBorrowed() ? "Not available" : "Available";
                        System.out.println(bookMap.getKey() + "\t" + bookMap.getValue().getName() + availablity);
                    }
                    break;
                }
//                case 2: {
//                    System.out.println("Enter your user id: ");
//                    String useId = scanner.nextLine();
//
//                    User user = library.findUser(useId);
//                    User user = library.findUser(useId);
//
//                }
            }
        }

    }
}