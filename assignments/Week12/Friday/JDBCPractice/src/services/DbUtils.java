package services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class DbUtils {

    private String url;
    private String username;
    private String password;

    private static DbUtils instance;

    private DbUtils() throws IOException {
		readProperties();
	}

    private void readProperties() throws IOException {
        Properties properties = new Properties();
		ResourceBundle rb = ResourceBundle.getBundle("resources.db");
		rb.keySet().stream().forEach(k -> properties.put(k, rb.getString(k)));
		this.url = properties.getProperty("db.url");
		this.username = properties.getProperty("db.username");
		this.password = properties.getProperty("db.password");
	}

	public static DbUtils getInstance() throws IOException {
		if (instance == null)
			instance = new DbUtils();
		return instance;
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

}