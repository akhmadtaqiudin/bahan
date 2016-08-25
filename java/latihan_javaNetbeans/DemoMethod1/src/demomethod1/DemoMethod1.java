/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomethod1;

/**
 *
 * @author oto
 */

class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    
    //mendefinisikan method void(tidak mengembalikan  nilai)
    void cetakVolume(){
        System.out.println("Volume kotak = "+(panjang * lebar * tinggi));
    }
}
public class DemoMethod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k1,k2,k3;
        
        //instansiasi objek
        k1 = new Kotak();
        k2 = new Kotak();
        k3 = new Kotak();
        
        //mengisi data unutk objek k1
        k1.panjang = 6;
        k1.lebar = 4;
        k1.tinggi = 3;
        
        //mengisi data untuk objek k2
        k2.panjang = 8;
        k2.lebar = 6;
        k2.tinggi = 4;
        
        //mengisi data untuk objek k3
        k3.panjang = 10;
        k3.lebar = 7;
        k3.tinggi = 4;
        
        //memanggil method cetakVolume() untuk masing-masing objek
        k1.cetakVolume();
        k2.cetakVolume();
        k3.cetakVolume();
    }
    
}
