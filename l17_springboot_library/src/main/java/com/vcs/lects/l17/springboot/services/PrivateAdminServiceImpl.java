package com.vcs.lects.l17.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.lects.l17.springboot.entities.Book;
import com.vcs.lects.l17.springboot.repositories.BookRepository;

@Service
public class PrivateAdminServiceImpl implements PrivateAdminService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAll() {
		
		List<Book> allBooks = new ArrayList<>();
		
		for (Book book : bookRepository.findAll()) {
			allBooks.add(book);
		}

		return allBooks;
	}

	public void delete(Long id) {
		bookRepository.deleteById(id);
	}

	public Book save(Book book) {
		return bookRepository.save(book);
	}

	public void saveAll(List<Book> books) {
		bookRepository.saveAll(books);
	}

}
