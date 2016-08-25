import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class HibernateSession {
  private static final SessionFactory sessionFactory;

  static {
    try {
      sessionFactory = new Configuration().configure().buildSessionFactory(); 
    } catch (HibernateException e) {
      throw new RuntimeException("SessionFactory Error - " + e.getMessage(), e);
    }
  }

  public static final ThreadLocal session = new ThreadLocal();

  public static Session currentSession() throws HibernateException { 
    Session s = (Session) session.get();

    if (s == null) {
      s = sessionFactory.openSession(); 
      session.set(s);
    }

    return s;
  }

  public static void closeSession() throws HibernateException { 
    Session s = (Session) session.get(); 
    session. set(null);
    if (s != null)
      s.close();
  }
}
