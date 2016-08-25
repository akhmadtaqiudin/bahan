public abstract class DAOFactory {
 
  public static final int MYSQL = 1;
  public static final int MOCK = 2;

  public abstract GroupDAO getGroupDAO();
  public abstract StoryDAO getStoryDAO();

  public static DAOFactory getDAOFactory(int factory) {
    switch(factory) {
      case MYSQL:
        return new MySQLDAOFactory();
      case MOCK:
        return new MockDAOFactory();
      default:
        return null;
    }
  }
}