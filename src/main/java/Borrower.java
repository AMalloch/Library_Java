import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> booksborrowed;

    public Borrower (String name){
        this.name = name;
        this.booksborrowed = new ArrayList<Book>();
    }

    public int getBookCount(){
        return this.booksborrowed.size();
    }

    public void addBook(Book book){
        this.booksborrowed.add(book);
    }

    public void takeLibraryBook(Library library){
        Book book = library.removeBook(0);
        this.addBook(book);
    }
}
