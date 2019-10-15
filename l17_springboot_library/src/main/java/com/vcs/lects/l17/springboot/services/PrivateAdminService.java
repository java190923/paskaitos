package com.vcs.lects.l17.springboot.services;

import java.util.List;

import com.vcs.lects.l17.springboot.entities.Book;

public interface PrivateAdminService {

	List<Book> getAll();

	void delete(Long id);

	Book save(Book book);

	void saveAll(List<Book> books);

}
