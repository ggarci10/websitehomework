package HW2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Listpatients
 */
@WebServlet("/Listpatients")
public class Listpatients extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */    public void init( ServletConfig config ) throws ServletException
     {
         super.init( config );
 //   this.id = idSeed++;
//         this.Vacname = Vacname;
//         this.DosesRequired = DosesRequired;
//         this.TotalDosesLeft=TotalDosesLeft;
//         this.TotalDosesReceived=TotalDosesReceived;
//         this.DaysBetweenDoses=DaysBetweenDoses;
         List<Patient> what = new ArrayList<Patient>();
         what.add( new Patient( "john", "Pfizer/BioNTech" ) );
         what.add( new Patient( "mary", "Johnson&Johnson" ) );
         what.add( new Patient( "lisa", "Pfizer/BioNTech" ) );
         getServletContext().setAttribute( "entry", what );
         
       
     }
     
    public Listpatients() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Vacentry> entries = (List<Vacentry>) getServletContext()
	            .getAttribute( "entries" );
			request.getRequestDispatcher("/WEB-INF/Listpatients.jsp").forward(request, response);
		
	}


}
