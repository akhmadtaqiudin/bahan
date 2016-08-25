import net.sf.hibernate.*;
import net.sf.hibernate.exception.*;

public class MySQLGroupDAO implements GroupDAO {

  public MySQLGroupDAO() {
  }

  private Session getSession() {
    try {
      Session session = HibernateSession.currentSession();
      return session;
    } catch (Exception e) {
    }
    
    return null;
  }

  private void closeSession() {
    try {
      HibernateSession.closeSession();
    } catch (Exception e) {
    }
  }

  public Group findGroup(int id) {

    Group group = null;
    try {
      Session session = getSession();

      group = (Group)session.load(Group.class, new Integer(id));
    } catch(Exception e) {
      
    } finally {
      closeSession();
    }

    return group;
  }

  public void insertGroup(Group group) {

    try {
      Session session = getSession();

      session.save(group);

    } catch(Throwable e) {
     
    } finally {
      closeSession();
    }
  }
}