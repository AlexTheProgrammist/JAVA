package Lab.LR_5.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:src/main/resources/database/students.db";  // Correct path

    // Method to connect to the database
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}
