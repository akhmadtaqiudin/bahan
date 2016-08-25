import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.code.Module;

public class ModuleTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Module mod = new Module();

      mod.setOwner("John Smith");
      mod.setName("Module 1");

      session.save(mod);
      session.flush();
System.out.println(mod.getTimestamp());

      mod.setOwner("James Doe");
      session.save(mod);
      session.flush();
      
System.out.println(mod.getTimestamp());
      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
