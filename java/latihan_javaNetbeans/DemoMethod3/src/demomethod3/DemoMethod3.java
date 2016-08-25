/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomethod3;

/**
 *
 * @author oto
 */

class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    
    //mendefinisikan method dengan parameter
    void isiData(double p,double l,double t){
    panjang = p;
    lebar = l;
    tinggi = t;
}
    double hitungVolume(){
        double vol = panjang * lebar * tinggi;
        return vol;
    }
}
public class DemoMethod3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k;
        
        //instansiasi objek
        k = new Kotak();
        
        //memanggil method isiData()
        k.isiData(8,5,6);
        
        System.out.println("Volume Kotak = " +k.hitungVolume());
    }
    
}
