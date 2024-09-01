package HW2;

import java.io.IOException;
import java.util.List;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondDose
 */
@WebServlet("/SecondDose")
public class SecondDose extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondDose() {
        super();
        // TODO Auto-generated constructor stub
    }
    private Patient getEntry( int id )
    { 
        List<Patient> what = (List<Patient>) getServletContext()
            .getAttribute( "entry" );
        for( Patient entry : what )
            if( entry.getId() == id ) return entry;
        return null;
    }
    private Vacentry getEn( String vac )
    { 
        List<Vacentry> entries = (List<Vacentry>) getServletContext()
            .getAttribute( "entries" );
        for( Vacentry entry : entries )
            if( entry.getVacname() == vac ) return entry;
        return null;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	



String id = request.getParameter( "id" );
Patient test = getEntry( Integer.parseInt( id ) );
test.setDoseTwo(true);
Date date = new Date();
test.setSecondDate(date);

Vacentry entries = getEn(test.getVacName() );
entries.setTotalDosesLeft(entries.getTotalDosesLeft()-1);
	//	entries.setTotalDosesLeft(entries.getTotalDosesLeft()-1);
	//	 entry.setTotalDosesLeft(entry.getTotalDosesLeft()-1);
    	
		 
		request.getRequestDispatcher("/WEB-INF/Listpatients.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
