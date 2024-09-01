package HW1;

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
 * Servlet implementation class VaccineEntry
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
        entries.add( new Vacentry( "Pfizer/BioNTech", 2,21,10000,10000 ) );
        entries.add( new Vacentry( "Johnson&Johnson", 1,0,5000,5000 ) );

        getServletContext().setAttribute( "entries", entries );
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Vacentry> entries = (List<Vacentry>) getServletContext()
	            .getAttribute( "entries" );

	        response.setContentType( "text/html" );
	        PrintWriter out = response.getWriter();
	        
	        out.println( "<html><head><title>vaccineentry</title></head><body>" );
	        //New Vaccine | New Doses
	        out.println( "<p><a href='NewVaccine'>New Vaccine</a>" );
	        out.println( "<a href='NewDoses'>|New Doses</a></p>" );
	        out.println( "<h2></h2>" );

	        out.println( "<table border='1'>" );
	        out.println( "<tr>" );
            out.println( "<td> Vaccine </td>" );
            out.println( "<td>  Doses Required	  </td>" );
            out.println( "<td> Days Between Doses	  </td>" );
            out.println( "<td>  Total Doses Received	   </td>" );
            out.println( "<td> Total Doses Left	  </td>" );
            out.println( "</tr>" );
	        for( Vacentry entry : entries )
	        {
	            out.println( "<tr>" );
	            out.println( "<td>" + entry.getVacname() + "</td>" );
	            out.println( "<td>" + entry.getDosesRequired() + "</td>" );
	            out.println( "<td>" + entry.getDaysBetweenDoses() + "</td>" );
	            out.println( "<td>" + entry.getTotalDosesReceived() + "</td>" );
	            out.println( "<td>" + entry.getTotalDosesLeft() + "</td>" );
	            out.println(
	                "<td><a href='EditVaccine?id=" + entry.getId() + "'>Edit</a> |" );
	          
	            out.println( "</td>" ); 
	            out.println( "</tr>" );
	        }
	        out.println( "</table>" );
	        out.println( "</body></html>" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
