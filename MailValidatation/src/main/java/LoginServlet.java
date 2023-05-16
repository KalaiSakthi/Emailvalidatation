

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpRequest request, HttpResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MailValidatation","root","sakthivillan");
	      String n=((ServletRequest) request).getParameter("txtemail");
	      String p=((ServletRequest) request).getParameter("txtPwd");
	      PreparedStatement ps=con.prepareStatement("select email from signup where email=? and password=?");
	      ps.setString(1,n);
	      ps.setString(2,p);
	      ResultSet rs=ps.executeQuery();
		
	      if(rs.next())
	      {
	    	  RequestDispatcher rd=(((ServletRequest) request).getRequestDispatcher("Additional.jsp"));
	    	  rd.forward(request,response);
	      }
	      else {
	    	 System.out.println("<font color=red size=18>Login Failed <br>!!");
	    	  System.out.println("<a href=login.jsp>Try Again!!</a>");
	      }
		
	}  
		catch(ClassNotFoundException e) {
		   e.printStackTrace();}
	}
}



