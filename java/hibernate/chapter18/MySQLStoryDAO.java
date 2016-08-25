import net.sf.hibernate.*;

public class MySQLStoryDAO implements StoryDAO {

  public MySQLStoryDAO() {
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

  public Story findStory(int id) {
    Story story = null;
    try {
      Session session = getSession();

      story= (Story)session.load(Story.class, new Integer(id));
    } catch(Exception e) {
      
    } finally {
      closeSession();
    }

    return story;
  }

  public void insertStory(Story story) {
    try {
      Session session = getSession();

      session.save(story);
    } catch(Exception e) {
      
    } finally {
      closeSession();
    }
  }
}