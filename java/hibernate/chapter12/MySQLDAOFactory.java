public class MySQLDAOFactory extends DAOFactory {

  public GroupDAO getGroupDAO() {
    return new MySQLGroupDAO();
  }

  public StoryDAO getStoryDAO() {
    return new MySQLStoryDAO();
  }
}