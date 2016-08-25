import java.util.*;

public class Console {
  private int id;
  private String name;
  private Map games;

  public Console() {
  }

  public Console(String name) {
    this.name = name;
  }

  public void setId(int i) {
    id = i;
  }

  public int getId() {
    return id;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void setGames(Map m) {
    games = m;
  }

  public Map getGames() {
    return games;
  }
}