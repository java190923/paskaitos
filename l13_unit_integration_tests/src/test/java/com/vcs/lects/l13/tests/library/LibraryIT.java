package com.vcs.lects.l13.tests.library;

import org.junit.Assert;
import org.junit.Test;

public class LibraryIT {

    @Test
    public void search() {

        Library library = new Library();
        java.util.List<Book> availableBooks = library.searchAvailableBooksByName("792387492734972349723947932874dsfsf");

        Assert.assertEquals(0, availableBooks.size());
    }

}
