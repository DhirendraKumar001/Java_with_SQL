import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "Ankit@123";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, userName, password);

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
