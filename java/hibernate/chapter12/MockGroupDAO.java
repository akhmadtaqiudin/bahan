public class MockGroupDAO implements GroupDAO {
  public MockGroupDAO() {
  }

  public Group findGroup(int id) {
    return new Group("MockGroup");
  }

  public void insertGroup(Group group) {
    // do nothing
  }
}