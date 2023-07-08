package telran.java47.book.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import telran.java47.book.model.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, String> {

}
