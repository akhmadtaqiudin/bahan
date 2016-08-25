import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class ConsoleTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Console sp = new Console("New Console");
     
      TreeMap p = new TreeMap(new GameComparator());
      Game g = new Game("Donkey Kong");
      Game g2 = new Game("Asteroids");
      p.put(g, new Instructions("Instructions for Donkey Kong"));
      p.put(g2, new Instructions("Instructions for Asteroids"));
      sp.setGames(p);

      session.save(g);
      session.save(g2);
session.flush();

      session.save(sp);
      session.flush();

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
