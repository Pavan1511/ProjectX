import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class signup extends HttpServlet
{
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out  =  response.getWriter();
        String a1  =  request.getParameter("a1");
        String a2  =  request.getParameter("a2");
        String a3  =  request.getParameter("a3");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Statement s = dbconnection.DBcon.dbconn();
            int x = s.executeUpdate("insert into signinup values('"+a1+"','"+a2+"','"+a3+"')");
            if(x == 1)
            {
                out.print("Succesful");
            }
            else
            {
                out.print("Unsuccesful");
            }
        }
        catch(Exception e1)
        {                
        }           
    }
}