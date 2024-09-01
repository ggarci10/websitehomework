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
		 response.setContentType( "text/html" );
	        PrintWriter out = response.getWriter();
	        
	        out.println( "<html><head><title>editvaccine</title></head><body>" );
	        out.println( "<form action='EditVaccine' method='post'>" );
	        out.println( "<input type='hidden' name='id' value='" + id + "'>" );
	       
	      //  out.println(id);
	        out.println( "<table border='1'>" );
	        out.println( "<tr>" );
            out.println( "<td> Name </td>" );
            out.println( "<td> "
      
            		+ "<input type='text' name='vacname' value ="
            		+ entry.getVacname()
            		+ " >"
            		
            		
            	
            		+ "  </td>" );
            out.println( "</tr>");
            out.println( "<tr>");
            out.println( "<td>  Doses Required	   </td>" );
            out.println( "<td> "
            		+"<select name='shots'>\"\r\n"
            		+ "            		+ \"<option value='1'>1</option>\"\r\n"
            		+ "            		+ \"<option value='2'>2</option>\""
            		+ "  </td>" );
            out.println( "</tr>" );
            out.println( "<td> Days between Doses   </td>" );
            out.println( "<td> "
            	      
            		+ "<input type='text' name='daysbetweendoses' value ="
            		+ entry.getDaysBetweenDoses()
            		+ " >"
            		
            		
            	
            		+ "  </td>" );
            
            out.println( "<tr>");
            out.println( "<td>");
            out.println( "<button>save</button></form>" );
            out.println( "</td>");
            out.println( "</tr>");
	        out.println( "</body></html>" );
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
