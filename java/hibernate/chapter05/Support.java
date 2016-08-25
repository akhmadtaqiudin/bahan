package example.util;

public class Support { 
  private int id;
  private String name; 
  private String support;

  public Support() {
  }

  public Support(String n, String s) {
    name = n;
    support = s;
  }

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

  public void setSupport(String s) {
    support = s;
  }

  public String getSupport() {
    return support;
  }
}
