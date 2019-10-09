package com.vcs.lects.l13.tests.library;

import java.util.ArrayList;
import java.util.List;

public class BookResource implements IBookResource {


    private List<Book> books = new ArrayList<>();

    public BookResource() {
        books.add(new Book("0", "Java pradziamokslis", true));
        books.add(new Book("1", "Java pazengusiems", true));
        books.add(new Book("2", "Java kava", false));
        books.add(new Book("3", "Java zemes ukyje su COBOL", true));
        books.add(new Book("4", "Programavimas JAVA", true));
        books.add(new Book("5", "Kodel?", false));
        books.add(new Book("6", "As nenoriu mokytis", true));
        books.add(new Book("7", "Kaip neperskaityti knygos", false));
        books.add(new Book("8", "Kodinimas JAVA zemes ukyje", true));
        books.add(new Book("ISBN-12324", "JS'as ir gyvenimas su juo... ir be jo", true));
        books.add(new Book("ISBN-98743w98437", "Java mastering cookbook with ...", true));
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public List<Book> getAvailableBooks() {

        List<Book> result = new ArrayList<>();

        for (Book book: books) {
            if (book.isAvailable()) {
                result.add(book);
            }
        }

        return result;
    }
}
