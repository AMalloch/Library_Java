import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower ("Angus");
        book = new Book(BookType.Horror);
        library = new Library(2000);
    }

    @Test
    public void bookCount(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void add(){
        borrower.addBook(book);
        assertEquals(1, borrower.getBookCount());
    }

    @Test
    public void takeBookFromLibrary(){
        library.addBook(book);
        borrower.takeLibraryBook(library);
        assertEquals(1, borrower.getBookCount());
    }
}
