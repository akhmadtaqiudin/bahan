import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.products.CD;
import example.products.SpecialEditionCD;
import example.products.InternationalCD;

public class CDTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      CD cd = new CD("Grace Under Pressure", "Rush", new Date(), 9.99);
      SpecialEditionCD secd = new SpecialEditionCD("Grace Under Pressure", "Rush", new Date(), 9.99, "Widescreen");
      InternationalCD icd = new InternationalCD("Grace Under Pressure", "Rush", new Date(), 9.99, "Spanish", 4);

      session.save(cd);
      session.save(secd);
      session.save(icd);

      session.flush();
     
      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
