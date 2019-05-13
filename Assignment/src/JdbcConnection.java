import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class JdbcConnection {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
	  System.out.println("-------- MySQL JDBC Connection Demo ------------");
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
      }
      catch (ClassNotFoundException e) {
          System.out.println("MySQL JDBC Driver not found !!");
          return;
      }
      System.out.println("MySQL JDBC Driver Registered!");
      Connection connection = null;
      try {
          connection = DriverManager
              .getConnection("jdbc:mysql://localhost:3306/pratice", "root", "1234");
          System.out.println("SQL Connection to database established!");

      } catch (SQLException e) {
          System.out.println("Connection Failed! Check output console");
          return;
      } finally {
          try
          {
              if(connection != null)
                  connection.close();
              System.out.println("Connection closed !!");
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
  }
}

