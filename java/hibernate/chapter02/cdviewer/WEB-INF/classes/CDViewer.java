import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*; 
import javax.naming.*;
import java.util.*;

import net.sf.hibernate.*;
import net.sf.hibernate.cfg.*;

public class CDViewer extends HttpServlet { 
  private SessionFactory sessionFactory;

  public void init(ServletConfig config) throws ServletException { 
    super.init(config);
    
    try {
      sessionFactory = new Configuration().addClass(CD.class).buildSessionFactory();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private void displayAll(PrintWriter out, Session session) {
    try {
      out.println("<html>");
      out.println("<table border='1'>");
      out.println("<tr><td>Title</td><td>Artist</td><td>cost</td></tr>");
      List cds = session.find("from CD");
	     
      Iterator iter = cds.iterator();
      while (iter.hasNext()) {
  	  CD cd = (CD)iter.next();
        out.println("<tr><td>");
  	  out.println(cd.getTitle());
        out.println("</td><td>");
 	  out.println(cd.getArtist());
        out.println("</td><td>");
        out.println(cd.getCost());
 	  out.println("</td></tr>");
      }	     
    } catch(Exception e) {}

    out.println("</table>");	 
    out.println("</html>");
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) 
                        throws IOException, ServletException {

    response.setContentType("text/html"); 
    PrintWriter out = response. getWriter();

        Session session = null;

        try {
          session = sessionFactory.openSession();

          String action = request.getParameter("submit"); 
          if (action.equals("Pull All CDs")) { 
            displayAll(out, session);
          } else {
             out.println("Bad Input");
          }

          session.flush();
          session.close();

        } catch (Exception e) {
           e.printStackTrace();
        } 
  }

  public void doPost(HttpServletRequest request,
                    HttpServletResponse response)
                        throws IOException, ServletException {
    doGet(request, response);
  }
}
