import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.accounting.AccAcc;

public class AccAccTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      AccAcc acc = new AccAcc(890304, "Personal", "John Smith");

      session.save(acc);
      session.flush();

      AccAcc acc2 = new AccAcc();
      acc2.setId(890394+"Personal"+"John Smith");
      session.load(acc2, acc2.getId());

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
