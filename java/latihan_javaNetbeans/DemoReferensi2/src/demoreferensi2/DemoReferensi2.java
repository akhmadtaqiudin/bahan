/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoreferensi2;

/**
 *
 * @author oto
 */

class Kotak{
    double panjang;
    double lebar;
    double tinggi;
}
public class DemoReferensi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double volume1,volume2;
        
        Kotak k1,k2;
        
        k1 = new Kotak();
        k2 = k1;
        
        k1.panjang = 8;
        k1.lebar = 4;
        k1.tinggi = 6;
        
        //sebelum nilai k1 diubah
        volume1 = k1.panjang * k1.lebar * k1.tinggi;
        volume2 = k2.panjang * k2.lebar * k2.tinggi;
        System.out.println("Sebelum k1 diubah:");
        System.out.println("VOlume k1 = "+volume1);
        System.out.println("VOlume k2 = "+volume2);
        
        k1 = new Kotak();
        k1.panjang = 10;
        k1.lebar = 5;
        k1.tinggi = 6;
        
        //setelah nilai k1 diubah
        volume1 = k1.panjang * k1.lebar * k1.tinggi;
        volume2 = k2.panjang * k2.lebar * k2.tinggi;
        System.out.println("\n setelah k1 diubah");
        System.out.println("Volume k1 = "+volume1);
        System.out.println("Volume k2 = "+volume2);
    }
    
}
