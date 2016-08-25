/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demooverloadconstructor;

/**
 *
 * @author oto
 */
class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    
    //mendefinisikan constructor tanpa parameter
    Kotak(){
        panjang=0;
        lebar=0;
        tinggi=0;
    }
    
    //mendefinisikan constructor dengan satu parameter
    Kotak(double sisi){
        panjang = lebar = tinggi = sisi;
    }
    
    //mendefinisikan constructor dengan tiga parameter
    Kotak(double p,double l,double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    double hitungVolume(){
        return(panjang * lebar * tinggi);
    }
}
public class DemoOverloadConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Kotak k1,k2,k3;
            
            k1 = new Kotak();
            k2 = new Kotak(10);
            k3 = new Kotak(4,3,2);
            
            //menampilkan volume dari masing-masing objek kotak
            System.out.println("Volume k1 = "+k1.hitungVolume());
            System.out.println("Volume k2 = "+k2.hitungVolume());
            System.out.println("Volume k3 = "+k3.hitungVolume());
    }
    
}
