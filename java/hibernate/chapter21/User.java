import java.util.*;

public class User Implements Inquire {
  private int id;
  private String username;
  private String password;

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

  public void setUsername(String n) {
    username = n;
  }

  public String getUsernme() {
    return username;
  }

  public void setPasswword(String l) {
    password = l;
  }

  public String getPassword() {
    return password;
  }

  public void flushDirty() {
    System.out.println("Call to flushDirty");
  }

  public void beforeSave() {
    System.out.println("Call to beforeSave");
  }

  public void justUpdated() {
    System.out.println("Call to justUpdated");
  }
}