import javax.swing.JOptionPane;

public class GetInputFromKeyboardWithJOptionPane{
  public static void main(String[]arg){
    String name1 = "";
    name1 = JOptionPane.showInputDialog("Enter Word 1: ");
    String name2 = "";
    name2 = JOptionPane.showInputDialog("Enter Word 2: ");
    String name3 = "";
    name3 = JOptionPane.showInputDialog("Enter Word 3: ");

    String msg = name1+" "+name2+" "+name3;
    JOptionPane.showMessageDialog(null, msg);
  }
}
