

//ignore the error this is meant to be one place to find a quick setp up only
// not ment to actually run
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Hello world!
 *
 */
public class Ex_sqlJava {
    public static void main(String[] args) {
        

        // jdbc:sqlserver://localhost\YourInstanceName:1234;databaseName=YourDatabase;;
        // String url = "jdbc:sqlserver://ABC\\SQLEXPRESS;databaseName=xyz;portNumber=1433";
        String connectionUrl = "jdbc:sqlserver://PAVILION\\SQLEXPRESS;database=Students;integratedSecurity=true;";

        // username and passowrd if working in Production
        // because it on my computure i don't need it

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connected to MS SQL Server");
            // Use the connection object

            // don't need to add dbo. infrom of studen
            String sql= "INSERT INTO studen (name, mark) VALUES ('Gol D. Ace', 89) ";

            Statement statement= connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if(rows > 0){
                System.out.println("add to tabel studen");
            }

            connection.close();

            String getName = "SELECT * FROM studen";
            Statement fetch = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count =0;

            while(result.next()){
                count++;
                String name = result.getString("name");
                int mark = result.getInt("mark");

                System.out.printf("Student %d: %s => %d\n", count, name, mark);
            }

            connection.close();

            //Example to add  row in anotehr way
            // PreparedStatement example = connection.prepareStatement(sql);

            // example.setString(2, "Moriah");
            // example.setInt(2, 69);
            // example.executeUpdate();
            // connection.close();
            

        } catch (SQLException e) {
            System.out.println("Unable to Connect to MS SQL Server");
            // Handle the exception
            e.printStackTrace();
        }

        System.out.println("Hello World!");
    }
}
