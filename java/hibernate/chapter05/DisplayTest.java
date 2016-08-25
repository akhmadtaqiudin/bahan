
import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.enum.UseDisplay;
import example.enum.Display;

public class DisplayTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      UseDisplay display = new UseDisplay();

      display.setDisplay(Display.SEMI);

      session.save(display);
      session.flush();

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
