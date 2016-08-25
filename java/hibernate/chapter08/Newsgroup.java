public class Newsgroup extends Group {
  private int first;
  private int last;
 
  public Newsgroup() {
  }

  public Newsgroup(String s) {
    super(s);
  }

  public void setFirst(int i) {
    first = i;
  }

  public int getFirst() {
    return first;
  }

  public void setLast(int i) {
    last = i;
  }

  public int getLast() {
    return last;
  }
}