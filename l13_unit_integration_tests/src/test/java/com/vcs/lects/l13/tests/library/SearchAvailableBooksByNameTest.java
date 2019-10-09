package com.vcs.lects.l13.tests.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchAvailableBooksByNameTest {

    private Library library = new Library();
    private List<Book> booksAvailable = null;

    @Before
    public void init() {

        booksAvailable = new ArrayList<>();
        booksAvailable.add(new Book("0", "JAVA", true));
        booksAvailable.add(new Book("1", "j a v a", true));
        // booksAvailable.add(new Book("2", "Java kava", false));
        booksAvailable.add(new Book("3", "JaVa", true));
        booksAvailable.add(new Book("4", "bilekas java   kazkas   ", true));
        booksAvailable.add(new Book("5", "kava su java", true));


        library = new Library(new IBookResource() {
            @Override
            public List<Book> getAllBooks() {
                throw new RuntimeException();
            }

            @Override
            public List<Book> getAvailableBooks() {
                return booksAvailable;
            }
        });
    }

    @Test
    public void successLowerCaseTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName("java");
        Assert.assertEquals("Knygu kieki skiriasi", 4, availableBooks.size());
        Assert.assertEquals("0", availableBooks.get(0).getIsbn());
        Assert.assertEquals("3", availableBooks.get(1).getIsbn());
        Assert.assertEquals("4", availableBooks.get(2).getIsbn());
        Assert.assertEquals("5", availableBooks.get(3).getIsbn());
    }

    @Test
    public void successUpperCaseTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName("JAVA");
        Assert.assertEquals("Knygu kieki skiriasi", 4, availableBooks.size());
        Assert.assertEquals("0", availableBooks.get(0).getIsbn());
        Assert.assertEquals("3", availableBooks.get(1).getIsbn());
        Assert.assertEquals("4", availableBooks.get(2).getIsbn());
        Assert.assertEquals("5", availableBooks.get(3).getIsbn());
    }

    @Test
    public void successMioxedCaseTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName("jaVA");
        Assert.assertEquals("Knygu kieki skiriasi", 4, availableBooks.size());
        Assert.assertEquals("0", availableBooks.get(0).getIsbn());
        Assert.assertEquals("3", availableBooks.get(1).getIsbn());
        Assert.assertEquals("4", availableBooks.get(2).getIsbn());
        Assert.assertEquals("5", availableBooks.get(3).getIsbn());
    }

    @Test
    public void successMioxedCaseNotTrimedTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName(" jaVA\t");
        Assert.assertEquals("Knygu kieki skiriasi", 4, availableBooks.size());
        Assert.assertEquals("0", availableBooks.get(0).getIsbn());
        Assert.assertEquals("3", availableBooks.get(1).getIsbn());
        Assert.assertEquals("4", availableBooks.get(2).getIsbn());
        Assert.assertEquals("5", availableBooks.get(3).getIsbn());
    }

    @Test
    public void failCaseTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName("cobol");
        Assert.assertEquals(0, availableBooks.size());
    }

    @Test
    public void failCaseEmptyTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName("");
        Assert.assertEquals(0, availableBooks.size());
    }

    @Test
    public void failCaseBlankTabTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName("\t");
        Assert.assertEquals(0, availableBooks.size());
    }

    @Test
    public void failCaseBlankSpaceTest() {
        List<Book> availableBooks = library.searchAvailableBooksByName(" ");
        Assert.assertEquals(0, availableBooks.size());
    }

    @Test(expected = NullPointerException.class)
    public void failNullTest() {
        library.searchAvailableBooksByName(null);
        Assert.fail();
    }

}
