package dbconnection;

import java.sql.Statement;
import java.sql.*;

public class DBcon
{
  public static Statement dbconn() throws ClassNotFoundException, SQLException
  {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","admin");
    Statement s = con.createStatement();
    return s;     
  }    
}