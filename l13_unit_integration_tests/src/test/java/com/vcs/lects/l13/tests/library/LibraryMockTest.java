package com.vcs.lects.l13.tests.library;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class LibraryMockTest {

    private Library library = null;
    private IBookResource resource = null;

    @Before
    public void init() {
        resource = Mockito.mock(IBookResource.class);
        library = new Library(resource);
    }

    @Test
    public void successLowerCaseTest() {
        Mockito.when(resource.getAllBooks()).thenThrow(new RuntimeException());
        Mockito.when(resource.getAvailableBooks()).thenReturn(new ArrayList<>());

        library.searchAvailableBooksByName("java");

        Mockito.verify(resource, Mockito.times(1)).getAvailableBooks();
        Mockito.verify(resource, Mockito.never()).getAllBooks();
    }


}
