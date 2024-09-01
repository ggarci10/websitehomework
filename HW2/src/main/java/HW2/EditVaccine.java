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
 * Servlet implementation class EditVaccine
 */
@WebServlet("/EditVaccine")
public class EditVaccine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditVaccine() {
        super();
        // TODO Auto-generated constructor stub
    }
    @SuppressWarnings("unchecked")
    private Vacentry getEntry( int id )
    { 
        List<Vacentry> entries = (List<Vacentry>) getServletContext()
            .getAttribute( "entries" );
        for( Vacentry entry : entries )
            if( entry.getId() == id ) return entry;
        return null;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter( "id" );
		Vacentry entry = getEntry( Integer.parseInt( id ) );
		request.setAttribute("entry", entry);
	
		request.getRequestDispatcher("/WEB-INF/EditVaccine.jsp").forward(request, response);
	       
	        
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	//	Vacentry entry = getEntry(Integer.parseInt( request.getParameter( "id" ) ) );
		String name= request.getParameter( "vacname" );
		      int days=  Integer.parseInt(request.getParameter( "daysbetweendoses" ))  ;
		        int shotsnum= Integer.parseInt(request.getParameter( "shots" ))  ;
	
		        Vacentry entry = getEntry(Integer.parseInt( request.getParameter( "id" ) ) );
		            //	total= Integer.parseInt(amount)
		            	
		            	  entry.setVacname( name);
		            	  entry.setDosesRequired(shotsnum);
		            	  entry.setDaysBetweenDoses(days);
		            	//  entry.setTotalDosesLeft(Integer.parseInt(amount)+ entry.getTotalDosesLeft());
		            
		        
		        response.sendRedirect( "VaccineEntry" );
		
	}

}
