package HW2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 6Servlet implementation class VaccineEntry
 */
@WebServlet("/VaccineEntry")
public class VaccineEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VaccineEntry() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init( ServletConfig config ) throws ServletException
    {
        super.init( config );
//   this.id = idSeed++;
//        this.Vacname = Vacname;
//        this.DosesRequired = DosesRequired;
//        this.TotalDosesLeft=TotalDosesLeft;
//        this.TotalDosesReceived=TotalDosesReceived;
//        this.DaysBetweenDoses=DaysBetweenDoses;
        List<Vacentry> entries = new ArrayList<Vacentry>();
        entries.add( new Vacentry( "Pfizer/BioNTech", 2,21,10000,1 ) );
        entries.add( new Vacentry( "Johnson&Johnson", 1,0,5000,0 ) );

        getServletContext().setAttribute( "entries", entries );
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/VaccineEntry.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
