/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demooverload1;

/**
 *
 * @author oto
 */
class Pembagian{
    //mendefinisikan method dengan dua parameter bertipe int
    int bagi(int a,int b ){
        return a/b;
    }
    //mendefinisikan method dengan dua parameter bertipe double
    double bagi(double a,double b){
        return a/b;
    }
}
public class DemoOverload1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pembagian b = new Pembagian();
        int x = b.bagi(10, 4);
        double y = b.bagi(10.0,4.0);
        
        System.out.println("Hasil bagi tipe int = " + x);
        System.out.println("Hasil bagi tipe double = " + y);
    }
    
}
