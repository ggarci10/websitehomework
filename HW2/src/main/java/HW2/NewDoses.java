package HW2;

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
		
	     
		List<Vacentry> entries = (List<Vacentry>) getServletContext()
	            .getAttribute( "entries" );
		request.getRequestDispatcher("/WEB-INF/NewDoses.jsp").forward(request, response);
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


	        response.sendRedirect( "VaccineEntry" );
	}

}