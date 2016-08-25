import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class SupportPropertyTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      SupportProperty sp = new SupportProperty();
     
      sp.setName("John Smith");
      HashMap p = new HashMap();
      p.put("color", "blue");
      p.put("lnf", "mac");
      sp.setProperties(p);

      session.save(sp);
      session.flush();

      SupportProperty sp2 = (SupportProperty)session.load(SupportProperty.class, new Integer(sp.getId()));

      Map p2 = sp2.getProperties();
      System.out.println(p2.get("color"));
      System.out.println(p2.get("lnf"));

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
