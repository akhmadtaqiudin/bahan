import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.code.VModule;

public class VModuleTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      VModule mod = new VModule();

      mod.setOwner("John Smith");
      mod.setName("Module 1");

      session.save(mod);
      session.flush();
System.out.println(mod.getVersion());

      mod.setOwner("James Doe");
      session.save(mod);
      session.flush();
      
System.out.println(mod.getVersion());
      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
