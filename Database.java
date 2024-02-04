import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    public static void main(String[] args) {
        String Url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "Ankit@123";
        String databaseName = "Book";

        try (Connection connection = DriverManager.getConnection(Url, userName, password)) {
            Statement statement = connection.createStatement();
            String createDatabaseQuery = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(createDatabaseQuery);
            System.out.println("Database created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}