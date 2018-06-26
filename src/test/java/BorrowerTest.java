import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Simon");
        book = new Book();
        library = new Library(5);
        library.addBook(book);
    }
    @Test
    public void noExistingLoan(){
        assertEquals(0, borrower.loanCount());
    }
}
