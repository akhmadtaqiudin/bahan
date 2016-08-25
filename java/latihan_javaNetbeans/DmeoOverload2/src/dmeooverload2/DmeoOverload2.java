/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmeooverload2;

/**
 *
 * @author oto
 */
class MyClass{
    //mendefinisikan method tanpa parameter
    void tulis(){
        System.out.println("Tanpa Parameter");
    }
    
    //mendefinisikan method dengan satu patrameter bertipe double
    void tulis(double d){
        System.out.println("Satu parameter, "+"dengan nilai argumen: "+d);
    }
}
public class DmeoOverload2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass c = new MyClass();
        
        c.tulis();
        c.tulis(4);//tidak mengakibatkan kesalahan(eror)
    }
    
}
