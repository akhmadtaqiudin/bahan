import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class GroupTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Group sp = new Group("accouting");
     
      ArrayList list = new ArrayList();
      list.add(new Story("A Story"));
      list.add(new Story("And yet another story"));
      sp.setStories(list);

 Transaction transaction;

 try {
   transaction = session.beginTransaction();

   session.update(sp);

   transaction.commit();
 } catch (Exception e) { 
   if (transaction != null) {
     transaction.rollback();
     throw e;
   }
 }  finally { 
   session.close();
 }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
