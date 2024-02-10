package queries;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import models.Book;
import services.DbUtils;

public class bookQuery {
    
    public static List<Book> getBooksQuery(String statement) {
        List<Book> books = new ArrayList<>();

        try {
            DbUtils dbUtils = DbUtils.getInstance();
            try (Connection connection = dbUtils.getConnection()) {
                
                PreparedStatement preparedStatement = connection.prepareStatement(statement);

                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String isbnN = resultSet.getString("isbn");
                    String name = resultSet.getString("name");
                    String genre = resultSet.getString("genre");

                    books.add(new Book(isbnN, name, genre));
                }  

            } catch (SQLException e) {
                System.out.println("Unable to get connection");
            }
        } catch (IOException e) {
            System.out.println("Unable to read from properties file.");
        }
        return books;
    }

    public static List<Book> getBooksQuery(String statement, String genre) {
        List<Book> books = new ArrayList<>();

        try {
            DbUtils dbUtils = DbUtils.getInstance();
            try (Connection connection = dbUtils.getConnection()) {
                
                PreparedStatement preparedStatement = connection.prepareStatement(statement);

                preparedStatement.setString(1, genre);

                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String isbnN = resultSet.getString("isbn");
                    String name = resultSet.getString("name");
                    String genreN = resultSet.getString("genre");

                    books.add(new Book(isbnN, name, genreN));
                }  

            } catch (SQLException e) {
                System.out.println("Unable to get connection");
            }
        } catch (IOException e) {
            System.out.println("Unable to read from properties file.");
        }
        return books;
    }

    public static Optional<Book> getBookOptional(String statement, String isbnOrName) {
        Optional<Book> book = null;

        try {
            DbUtils dbUtils = DbUtils.getInstance();
            try (Connection connection = dbUtils.getConnection()) {
                
                PreparedStatement preparedStatement = connection.prepareStatement(statement);

                preparedStatement.setString(1, isbnOrName);

                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String isbnN = resultSet.getString("isbn");
                    String name = resultSet.getString("name");
                    String genreN = resultSet.getString("genre");

                    book = Optional.of(new Book(isbnN, name, genreN));
                }  

            } catch (SQLException e) {
                System.out.println("Unable to get connection");
            }
        } catch (IOException e) {
            System.out.println("Unable to read from properties file.");
        }
        return book;
    }

    public static Book getSavedBook(String statement, Book book) {
        Book bookN = null;

        try {
            DbUtils dbUtils = DbUtils.getInstance();
            try (Connection connection = dbUtils.getConnection()) {
                
                PreparedStatement preparedStatement = connection.prepareStatement(statement);

                preparedStatement.setString(1, book.getISBN());
                preparedStatement.setString(2, book.getName());
                preparedStatement.setString(3, book.getGenre());
                
                while (preparedStatement.executeUpdate() >= 0) {
                    bookN = new Book(book.getISBN(), book.getName(), book.getGenre());
                }  

            } catch (SQLException e) {
                System.out.println("Unable to get connection");
            }
        } catch (IOException e) {
            System.out.println("Unable to read from properties file.");
        }
        return bookN;
    }

    public static Book getUpdatedBook(String statement, Book book) {
        Book bookN = null;

        try {
            DbUtils dbUtils = DbUtils.getInstance();
            try (Connection connection = dbUtils.getConnection()) {
                
                PreparedStatement preparedStatement = connection.prepareStatement(statement);

                preparedStatement.setString(1, book.getName());
                preparedStatement.setString(2, book.getGenre());
                preparedStatement.setString(3, book.getISBN());
                
                while (preparedStatement.executeUpdate() >= 0) {
                    bookN = new Book(book.getISBN(), book.getName(), book.getGenre());
                }  

            } catch (SQLException e) {
                System.out.println("Unable to get connection");
            }
        } catch (IOException e) {
            System.out.println("Unable to read from properties file.");
        }
        return bookN;
    }

}
