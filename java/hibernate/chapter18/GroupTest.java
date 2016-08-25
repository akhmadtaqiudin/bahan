import java.io.*;
import java.util.*;

public class GroupTest {

  public static void main(String [] args) {

    DAOFactory mysqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    
    GroupDAO groupDAO = mysqlFactory.getGroupDAO();

    Group sp = new Group("accouting");
     
    ArrayList list = new ArrayList();
    list.add(new Story("A Story"));
    list.add(new Story("And yet another story"));
    sp.setStories(list);

    groupDAO.insertGroup(sp);
  }
}
