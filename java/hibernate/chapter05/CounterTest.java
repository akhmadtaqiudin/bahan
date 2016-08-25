import java.io.*;
import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.count.Counter;

public class CounterTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Counter counter = new Counter();

      Integer i = new Integer("34");
      counter.setIvalue(i);

      session.save(counter);
      session.flush();
    
      Counter counter2 = (Counter)session.load(Counter.class, counter.getId());

      System.out.println(counter.getId() + " : " + counter.getIvalue().intValue());
      System.out.println(counter2.getId() + " : " + counter2.getIvalue().intValue());

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
