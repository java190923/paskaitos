package com.vcs.lects.l17.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vcs.lects.l17.springboot.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	// SELECT * FROM books as b WHERE b.name ILIKE ('Karas ir taika') AND b.author
	// ILIKE( 'Tolstojus')

	List<Book> findByAuthorContainingIgnoreCaseAndNameContainingIgnoreCase(String author, String name);

	// SELECT * FROM books as b WHERE b.name ILIKE ('Karas ir taika') OR b.author
	// ILIKE( 'Tolstojus')
	List<Book> findByAuthorContainingIgnoreCaseOrNameContainingIgnoreCase(String author, String name);

	// SELECT * FROM book WHERE author = '???'
//	List<Book> findByAuthor(String author);
	
	@Query("SELECT b FROM Book b WHERE (b.count > 0 OR :onlyAvailable = FALSE)"
			+ " AND (UPPER(b.name) LIKE UPPER(CONCAT('%',:searchText,'%'))"
			+ " OR UPPER(b.author) LIKE UPPER(CONCAT('%',:searchText,'%'))"
			+ " OR UPPER(b.codeISBN) LIKE UPPER(CONCAT('%',:searchText,'%')))")
	List<Book> fetchBooks(String searchText, boolean onlyAvailable);

}
