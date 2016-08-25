public class MockDAOFactory extends DAOFactory {

  public GroupDAO getGroupDAO() {
    return new MockGroupDAO();
  }

  public StoryDAO getStoryDAO() {
    return new MockStoryDAO();
  }
}