package daos;

import java.util.List;
import java.util.Optional;

import models.Book;

public interface BookDao {

    Optional<Book> findbyISBN(String statement, String isbn);
    Optional<Book> findByName(String statement, String name);
    List<Book> findbyGenre(String statement, String genre);
    List<Book> findAll(String statement);
    Book save(String statement, Book book);
    Book update(String statement, Book book);
    void delete(Book book);
    void deleteByISBN(String isbn);
}