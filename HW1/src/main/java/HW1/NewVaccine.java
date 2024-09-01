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
 * Servlet implementation class NewVaccine
 */
@WebServlet("/NewVaccine")
public class NewVaccine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewVaccine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType( "text/html" );
	        PrintWriter out = response.getWriter();
	        out.println( "<html><head><title>NewVaccine</title></head><body>" );
	        out.println(  "<form action='NewVaccine' method='post'>" );
	        out.println( "<table border='1'>" );
	        out.println( "<tr>" );
            out.println( "<td> name </td>" );
            out.println( "<td> <input type='text' name='name'><br>  </td>" );
            out.println( "</tr>" );
            out.println( "<td> Doses Required		  </td>" );
            out.println( "<td><form action='NewVaccine' method='post'>  <select name='shots'>"
            		+ "<option value='1'>1</option>"
            		+ "<option value='2'>2</option>"
            		+ "</select> <form>  </td>" );
            out.println( "<tr>" );
            out.println( "<td> Days Between Doses	  </td>" );
            out.println( "<td><input type='text' name='daysbetweendoses'><br>   </td>" );
            out.println( "</tr>" );
            out.println(  "<td>");
            out.println( "<button>Add</button></form>" );
            out.println(  "</td>");
            out.println( "</tr>" );
           
	     //   out.println( "<form action='NewVaccine' method='post'>" );
	     //   out.println( "Name: <input type='text' name='name'><br>" );
	    //    out.println(
	    //        "<textarea name='message' rows='6' cols='40'></textarea><br>" );
	 
	        out.println( "</body></html>" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter( "name" );
		 String test = request.getParameter("shots");
		 String doses =request.getParameter("daysbetweendoses");
	        Vacentry entry = new Vacentry( name, Integer.parseInt(test),Integer.parseInt(doses),5,5 );

	        List<Vacentry> entries = (List<Vacentry>) getServletContext()
	            .getAttribute( "entries" );
	        entries.add( entry );

	        response.sendRedirect( "VaccineEntry" );
	}

}
