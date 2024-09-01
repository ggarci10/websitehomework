package HW2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewPatient
 */
@WebServlet("/NewPatient")
public class NewPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewPatient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     
		List<Vacentry> entries = (List<Vacentry>) getServletContext()
	            .getAttribute( "entries" );
		request.getRequestDispatcher("/WEB-INF/NewPatient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String name = request.getParameter("patientname");
		String vac = request.getParameter("vaccine");
	      
		
		List<Patient> what = (List<Patient>) getServletContext()
	            .getAttribute( "entry" );
		what.add( new Patient( name, vac ) );
        
		
			
	        response.sendRedirect( "Listpatients" );
	}

}
