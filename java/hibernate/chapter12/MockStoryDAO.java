public class MockStoryDAO implements StoryDAO{
  public MockStoryDAO() {
  }

  public Story findStory(int id) {
    return new Story("Mock New Story");
  }

  public void insertStory(Story story) {
    // do nothing
  }
}