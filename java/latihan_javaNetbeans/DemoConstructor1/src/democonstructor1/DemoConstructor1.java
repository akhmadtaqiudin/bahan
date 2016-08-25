/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democonstructor1;

/**
 *
 * @author oto
 */
class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    //mendefinisikan constructor untuk kelas Kotak
    Kotak(){
        panjang = 4;
        lebar = 3;
        tinggi = 2;
    }
    double hitungVolime(){
        return (panjang * lebar * tinggi);
    }
}
public class DemoConstructor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k1,k2;
        k1 = new Kotak();
        k2 = new Kotak();
        
        System.out.println("VOlume Kotak = "+k1.hitungVolime());
        System.out.println("Volume Kotak = "+k2.hitungVolime());
    }
    
}
