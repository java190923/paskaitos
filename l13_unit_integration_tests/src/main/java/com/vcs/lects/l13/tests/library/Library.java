package com.vcs.lects.l13.tests.library;


import java.util.ArrayList;
import java.util.List;

public class Library {

    private IBookResource resource;

    public Library(IBookResource resource) {
        this.resource = resource;
    }

    public Library() {
        resource = new BookResource();
    }

    public List<Book> searchAvailableBooksByName(String searchCriteria) {

        searchCriteria = searchCriteria.trim();
        List<Book> result = new ArrayList<>();
        if (!searchCriteria.isBlank()) {
            for (Book book : resource.getAvailableBooks()) {
                if (filterCheck(book, searchCriteria)) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    private boolean filterCheck(Book book, String searchCriteria) {
        return book.getName().toLowerCase().contains(searchCriteria.toLowerCase());
    }


}
