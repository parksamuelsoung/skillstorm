package daos;

import java.util.List;
import java.util.Optional;
import models.Book;
import queries.bookQuery;

public class BookDaoMySqlImpl implements BookDao {

    @Override
    public Optional<Book> findbyISBN(String statement, String isbn) {
        return bookQuery.getBookOptional(statement, isbn);
    }

    @Override
    public Optional<Book> findByName(String statement, String name) {
        return bookQuery.getBookOptional(statement, name);
    }

    @Override
    public List<Book> findbyGenre(String statement, String genre) {
        return bookQuery.getBooksQuery(statement, genre);
    }

    @Override
    public List<Book> findAll(String statement) {
        return bookQuery.getBooksQuery(statement);
    }

    @Override
    public Book save(String statement, Book book) {
        return bookQuery.getSavedBook(statement, book);
    }

    @Override
    public Book update(String statement, Book book) {
        return bookQuery.getUpdatedBook(statement, book);
    }

    @Override
    public void delete(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteByISBN(String isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByISBN'");
    }
    
}
