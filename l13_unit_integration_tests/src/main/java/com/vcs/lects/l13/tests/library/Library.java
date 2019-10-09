package com.vcs.lects.l13.tests.library;


import java.util.ArrayList;
import java.util.List;

public class Library {

    //    private List<Book> books = new ArrayList<>();
    private IBookResource resource;


    public Library(IBookResource resource) {
        this.resource = resource;
    }

    public Library() {
        resource = new BookResource();
    }

    public List<Book> searchAvailableBooksByName(String searchCriteria) {

        List<Book> result = new ArrayList<>();
        for (Book book : resource.getAvailableBooks()) {
            if (filterCheck(book, searchCriteria)) {
                result.add(book);
            }
        }
        return result;
    }

    private boolean filterCheck(Book book, String searchCriteria) {

//        if (searchCriteria == null) {
//            return false;
//        }

        if (searchCriteria.isBlank()) {
            return false;
        }

        return book.getName().toLowerCase().contains(searchCriteria.toLowerCase());

    }


}
