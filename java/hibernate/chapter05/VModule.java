package example.code;

public class VModule { 
  public int id;
  private String name; 
  private String owner; 
  private int version;

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

  public void setVersion(int i) {
    version = i;
  }

  public int getVersion() {
    return version;
  }

}
