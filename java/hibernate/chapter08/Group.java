import java.util.*;

public class Group {
  private int id;
  private String name;
  private boolean active;
  private List stories;
  private Server primaryserver;

  public Group(){
  }

  public Group(String name) {
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

  public void setActive(boolean b) {
    active = b;
  }

  public boolean getActive() {
    return active;
  }

  public void setStories(List l) {
    stories = l;
  }

  public List getStories() {
    return stories;
  }

  public void setPrimaryserver(Server s) {
    primaryserver = s;
  }

  public Server getPrimaryserver() {
    return primaryserver;
  }
}