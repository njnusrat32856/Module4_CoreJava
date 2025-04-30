public class Book {

    private String id;
    private String name;
    private boolean isBorrowed;

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
        isBorrowed = false;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name =name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void borrow(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }
}
