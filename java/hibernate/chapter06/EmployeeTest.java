import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class EmployeeTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Employee sp = new Employee();
      Employee sp3 = new Employee();
     
      sp.setName("John Doe");
      HashMap p = new HashMap();
      p.put("health", new Benefit(200));
      p.put("dental", new Benefit(300));
      sp.setBenefits(p);

      sp3.setName("Jim Smith");
      sp3.setBenefits(p);

      session.save(sp);
      session.save(sp3);
      session.flush();

      Employee sp2 = (Employee)session.load(Employee.class, new Integer(sp.getId()));

      Map p2 = sp2.getBenefits();
      System.out.println(((Benefit)p2.get("health")).getCost());
      System.out.println(((Benefit)p2.get("dental")).getCost());

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
