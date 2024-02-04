import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table{
    
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "Ankit@123";
        String databaseName = "Book";

        try{
            class.forname("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, databaseName, userName, password);
            Statement statement = connection.createStatement();
            String querry1 = "create table user if not exists(username varchar(20),password varchar(30))";
            statement.execute(query1);
            System.out.println("table created if not exists");
            String query2="insert into users values('Dhirendra','Ankit@123')";
            int x=statement.executeUpdate(querry2);
            if (x>0){
             System.out.println("Data Inserted");
            }
            else{
                System.out.println("Data Insertion failed");
            statement.close();
            connection.close();
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

       }
    }
}
