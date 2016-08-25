import java.util.*;

public class HighScores {
  private int id;
  private String name;
  private Set games;

  public HighScores() {
  }

  public HighScores(String name) {
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

  public void setGames(Set games) {
    this.games = games;
  }

  public Set getGames() {
    return games;
  }
}