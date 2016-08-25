/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomethod2;

/**
 *
 * @author oto
 */
class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    
    //mendefinisikan method yang mengembalikan tipe double
    double hitungVolume(){
        double vol = panjang * lebar * tinggi;
        //mengembalikan nilai
        return vol;
    }
}

public class DemoMethod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k1,k2,k3;
        
        k1 = new Kotak();
        k2 = new Kotak();
        k3 = new Kotak();
        
        k1.panjang = 6;
        k1.lebar = 4;
        k1.tinggi = 2;
        
        k2.panjang = 8;
        k2.lebar = 6;
        k2.tinggi = 4;
        
        k3.panjang = 10;
        k3.lebar = 8;
        k3.tinggi = 6;
        
        System.out.println("Volume k1 = "+ k1.hitungVolume());
        System.out.println("Volume k2 = "+ k2.hitungVolume());
        System.out.println("Volume k3 = "+ k3.hitungVolume());
    }
    
}
