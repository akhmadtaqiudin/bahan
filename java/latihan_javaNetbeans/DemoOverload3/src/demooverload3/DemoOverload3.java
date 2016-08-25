/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demooverload3;

/**
 *
 * @author oto
 */
class MyClass{
    //mendefinisikan method dengan parameter int dan string
    void tulis(int a,String s){
        System.out.println("int : "+a+",String: \"" +s+ "\"");
    }
    
    //mendefinisikan method dengan parameter String dan int
    void tulis(String s,int a){
        System.out.println("String: \""+s+"\",int: " + a);
    }
}
public class DemoOverload3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass c= new MyClass();
        
        c.tulis(4,"COntoh method pertama");
        c.tulis("Contoh method kedua", 8);
    }
    
}
