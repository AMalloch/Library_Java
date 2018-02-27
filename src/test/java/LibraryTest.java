import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(2000);
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canCheckStock(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook(0);
        assertEquals(0, library.getBookCount());
    }
}
