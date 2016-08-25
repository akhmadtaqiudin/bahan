public class GameScore {
  private int id;
  private String name;
  private int score;
  
  public GameScore() {
  }

  public GameScore(String name, int score) {
    this.name = name;
    this.score = score;
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

  public void setScore(int i) {
    score = i;
  }

  public int getScore() {
    return score;
  }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        
        GameScore obj2 = (GameScore)obj;

        if ((this.id == obj2.getId()) &&
            (this.name.equals(obj2.getName())) &&
            (this.score == obj2.getScore())
            ) {
            return true;
        }
        
	  return false;
    }

    public int hashCode() {      
        int tmp = 0;
        tmp = (id + name + score).hashCode();

        return tmp;
    }
}