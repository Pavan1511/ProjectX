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

@WebServlet("/signin")
public class signin extends HttpServlet
{
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out  =  response.getWriter();
        String a2 = request.getParameter("a2");
        String a3 = request.getParameter("a3");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Statement s = dbconnection.DBcon.dbconn();
            ResultSet rs =  s.executeQuery("select * from signinup where email = '"+a2+"' && password = '"+a3+"'");
            if(rs.next())
            {
                out.print("succesful");
            }
            else
            {
                out.print("Unsuccesful");
            }            
        }
        catch(Exception e)
        {                
        }          
    }
}