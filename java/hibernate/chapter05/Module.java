package example.code;

import java.sql.*;

public class Module { 
  public int id;
  private String name; 
  private String owner; 
  private Timestamp timestamp;

  public void setId(int i) {
    id = i;
  }

  public int getId() {
    return id;
  }

  public void setName(String s) {
    name = s;
  }

  public String getName() {
    return name;
  }

  public void setOwner(String s) {
    owner = s;
  }

  public String getOwner() {
    return owner;
  }

  public void setTimestamp(Timestamp t) {
    timestamp = t;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

}
