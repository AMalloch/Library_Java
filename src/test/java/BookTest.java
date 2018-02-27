import static org.junit.Assert.*;
import org.junit.*;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book(BookType.Horror);
    }

    @Test
    public void horrorString(){
        book = new Book(BookType.Horror);
        assertEquals("This book is a horror.", book.getValueFromGenre());
    }
}
