public class Instructions {
  private int id;
  private String info;

  public Instructions() {
  }

  public Instructions(String info) {
    this.info = info;
  }

  public void setId(int i) {
    id = i;
  }

  public int getId() {
    return id;
  }

  public void setInfo(String s) {
    info = s;
  }

  public String getInfo() {
    return info;
  }
}