import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class GroupTest {

  public static void main(String [] args) {



    try {
      Session session = HibernateSession.currentSession(); 

      Newsgroup sp = new Newsgroup("misc.hibernate");
      Newsgroup sp2 = new Newsgroup("misc.software");
      Group sp3 = new Group("alt.donothing");
   
      ArrayList list = new ArrayList();
      list.add(new Story("A Story"));
      list.add(new Story("And yet another story"));
      sp.setStories(list);

      ArrayList list2 = new ArrayList();
      list2.add(new Story("For the good of men"));
      list2.add(new Story("Venus and Mars"));
      list2.add(new Story("All The Rest"));
      sp3.setStories(list2);

      Server server = new Server("Forte", "news.forteinc.com", 485, "mrfred", "freds");
      Server server2 = new Server("comcast", "news.comcast.net", 0, "mrfred", "freds");
      Server server3 = new Server("free news", "news.freenews.com", 0, "mrfred", "freds");
      sp.setPrimaryserver(server);
      sp.setActive(true);

      session.save(sp);
	session.save(sp2);
      session.save(sp3);
      session.save(server2);
      session.save(server3);

      session.flush();
      session.close(); 
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
