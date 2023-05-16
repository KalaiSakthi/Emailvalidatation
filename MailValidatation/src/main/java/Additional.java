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


@WebServlet("/Additional")
public class Additional extends HttpServlet {
 private static final long serialVersionUID = 1L;
 protected void doPost(HttpRequest request, HttpResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	 String Age =  ((ServletRequest) request).getParameter("age");
	 String Gender=  ((ServletRequest) request).getParameter("gender");
	 String DOB =  ((ServletRequest) request).getParameter("dob");
	 String PH =  ((ServletRequest) request).getParameter("ph");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MailValidatation","root","sakthivillan");
		 String age=((ServletRequest) request).getParameter("txtage");
		  String gender=((ServletRequest) request).getParameter("txtgender");
	      String dob=((ServletRequest) request).getParameter("txtdob");
	      String ph=((ServletRequest) request).getParameter("txtph");
	      PreparedStatement ps=con.prepareStatement("insert into users(age,gender,dob,ph)values(????)");
	      ps.setString(1,age);
	      ps.setString(2,gender);
	      ps.setString(3,dob);
	      ps.setString(4,ph);
	      ResultSet rs=ps.executeQuery();
		
	      if(rs.next())
	      {
	    	  RequestDispatcher rd=(((ServletRequest) request).getRequestDispatcher("Welcome.jsp"));
	    	  rd.forward(request,response);
	      }
	      else {
	    	 System.out.println("<font color=red size=18>SignUp Failed <br>!!");
	    	  System.out.println("<a href=login.jsp>Try Again!!</a>");
	      } 
	    
		
	}  
		catch(ClassNotFoundException e) {
		   e.printStackTrace();}
	}
}