package telran.java47.book.service;

import telran.java47.book.dto.BookDto;

public interface BookService {
	boolean addBook(BookDto bookDto);
	
	BookDto findBookByIsbn(String isbn);

}
