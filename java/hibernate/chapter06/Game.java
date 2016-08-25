public class Game {
  private int id;
  private String name;
  
  public Game() {
  }

  public Game(String name) {
    this.name = name;
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

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        
        Game obj2 = (Game)obj;

        if ((this.id == obj2.getId()) &&
            this.name.equals(obj2.getName())) {
            return true;
        }
        
	  return false;
    }

    public int hashCode() {      
        int tmp = 0;
        tmp = (id + name).hashCode();

        return tmp;
    }
}