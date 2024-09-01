package HW1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewDoses
 */
@WebServlet("/NewDoses")
public class NewDoses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewDoses() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType( "text/html" );
	        PrintWriter out = response.getWriter();
		List<Vacentry> entries = (List<Vacentry>) getServletContext()
	            .getAttribute( "entries" );
		  out.println( "<html><head><title>newdoses</title></head><body>" );
		  out.println( "<table border='1'>" );
		  out.println( "<tr>");
		  out.println( "<td>   Vaccine  </td>");
		//  out.println( "<td><form action='NewDoses' method='post'>  <select name='vaccines'>");
		  out.println( "<td><form action='NewDoses' method='post'>  <select name='vaccines'>");
		
	
		  for( Vacentry entry : entries )
	        {
			  out.println("<option value="+entry.getId()  +">"+entry.getVacname()+ "</option>");
	           
	          //  out.println( "</tr>" );
	        }
		  out.println("</select>" );
		  out.println( "</td>" );
		  out.println( "</tr>");
		  out.println( "<tr>");
		  out.println( "<td>" );
		  out.println( "new doses recieved" );
		  out.println( "</td>" );
		  out.println( "<td>" );
		     out.println(  "<input type='text' name='amountofdoses'>" );
		  out.println( "</td>" );
		 
		  out.println( "</tr>");
 out.println( "<tr>");
 out.println( "<td>" );
 out.println( "<button>Add</button></form>" );
 out.println( "</td>" );
		  out.println( "</tr>");
		  out.println( "</table>" );
		  out.println( "</body>" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String test = request.getParameter("vaccines");
		String amount = request.getParameter("amountofdoses");
	      
		  List<Vacentry> entries = (List<Vacentry>) getServletContext()
		            .getAttribute( "entries" );
	
		        for( Vacentry entry : entries ) {
		            if( entry.getId() == Integer.parseInt(test) ) {
		            //	total= Integer.parseInt(amount)
		            	
		            	  entry.setTotalDosesReceived(Integer.parseInt(amount)+ entry.getTotalDosesReceived());
		            	  entry.setTotalDosesLeft(Integer.parseInt(amount)+ entry.getTotalDosesLeft());
		            }
		        }

        
//		  for( Vacentry entry : entries )
//	        {	int what=  entry.getTotalDosesReceived()+Integer.parseInt(amount);
//			  if(entry.getId()==test) {
//			
//				  entry.setTotalDosesReceived(what);
//			  }
//	           
//	          //  out.println( "</tr>" );
//	        }

	        response.sendRedirect( "VaccineEntry" );
	}

}
