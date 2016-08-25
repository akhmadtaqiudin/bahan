import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class GameScoreTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      HighScores sp = new HighScores("James");
     
      HashSet set = new HashSet();
      set.add(new GameScore("Asteroids", 3784783));
      set.add(new GameScore("PacMan", 20823));
      sp.setGames(set);

      session.save(sp);
      session.flush();

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
