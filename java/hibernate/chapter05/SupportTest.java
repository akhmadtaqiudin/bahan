import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.util.Support;

public class SupportTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Support support = new Support("First", "Second");

      session.save(support);
      session.flush();
    
      support.setName("Name");
      session.update(support);
      session.flush();

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
