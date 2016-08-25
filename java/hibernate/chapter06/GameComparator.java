import java.util.*;

public class GameComparator implements Comparator {
  public int compare(Object o1, Object o2) { 
        Game game1 = (Game)o1; 
        Game game2 = (Game)o2; 

       return game1.getName().compareTo(game2.getName()); 
    } 

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        
               
	  return true;
    }

}