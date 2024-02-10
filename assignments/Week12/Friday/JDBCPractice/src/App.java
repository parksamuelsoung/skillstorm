import java.io.IOException;

import daos.BookDao;
import daos.BookDaoMySqlImpl;
import models.Book;

public class App {

    BookDao dao = new BookDaoMySqlImpl();

	public static void main(String[] args) throws IOException {
		App app = new App();
		app.start();
	}
	
	public void start() {

        try {
            System.out.println("\nFind All");
            System.out.println(dao.findAll("select * from book;"));

            System.out.println("\nFind All By Genre");
            System.out.println(dao.findbyGenre("select * from book where genre like ?;", "fable"));

            System.out.println("\nFind By ISBN");
            System.out.println(dao.findbyISBN("select * from book where isbn = ?;", "3b00"));

            System.out.println("\nFind By Name");
            System.out.println(dao.findByName("select * from book where name like ?;", "%goats%"));

            // Did not implement checks to see if already in database.
            System.out.println("\nSave Book");
            System.out.println(dao.save("insert into book values (?, ?, ?);", new Book("6b00", "The Little Red Hen", "Fable")));

            // Did not implement checks to see if already in database.
            System.out.println("\nUpdate Book");
            System.out.println(dao.update("update book set name = ?, genre = ? where isbn = ?", new Book("1a00", "Silly Stories", "Entertainment")));

            // I'm stopping here!

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
