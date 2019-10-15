package com.vcs.lects.l17.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vcs.lects.l17.springboot.entities.Book;
import com.vcs.lects.l17.springboot.repositories.BookRepository;

@Service
public class PublicLibraryServiceImpl implements PublicLibraryService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Optional<Book> findById(long id) {
		return bookRepository.findById(id);
	}

	@Override
	public List<Book> findByAnyText(String text) {
		return bookRepository.fetchBooks(text, true);
	}

	@Override
	public List<Book> findByNameAndAuthor(String author, String name) {
		return bookRepository.findByAuthorContainingIgnoreCaseAndNameContainingIgnoreCase(author, name);
	}

	@Override
	public List<Book> findByNameOrAuthor(String author, String name) {
		return bookRepository.findByAuthorContainingIgnoreCaseOrNameContainingIgnoreCase(author, name);
	}

	@Override
	@Transactional
	public boolean takeBook(long id) {

		Optional<Book> book = bookRepository.findById(id);
		if (book.isPresent()) {

			if (book.get().getCount() > 0) {
				book.get().setCount(book.get().getCount() - 1);
				return true;
			}
		}
		return false;
	}

	@Override
	@Transactional
	public boolean returnBook(long id) {

		Optional<Book> book = bookRepository.findById(id);
		if (book.isPresent()) {

			book.get().setCount(book.get().getCount() + 1);
			return true;

		}
		return false;
	}

}
