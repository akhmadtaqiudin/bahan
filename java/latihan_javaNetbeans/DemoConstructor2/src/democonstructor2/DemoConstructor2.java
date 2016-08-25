/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democonstructor2;

/**
 *
 * @author oto
 */
class Kotak{
    double panjang;
    double lebar;
    double tinggi;
   
    Kotak(double panjang,double lebar,double tinggi){
        this.panjang = panjang;//penggunaan this pada constructor bila parameter memiliki nama yang sama dengan data yg ada pada kelas
        this.lebar = lebar;//hasilnya sama dengan tidak menggunakan this
        this.tinggi = tinggi;
    }
    double hitungVolume(){
        return (panjang * lebar * tinggi);
    }
}
public class DemoConstructor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k1,k2,k3;
        
        k1 = new Kotak(4,3,2);
        k2 = new Kotak(6,5,3);
        k3 = new Kotak(8,7,6);
        
        System.out.println("Volume Kotak1 = "+k1.hitungVolume());
        System.out.println("Volume Kotak2 = "+k2.hitungVolume());
        System.out.println("Volume Kotak3 = "+k3.hitungVolume());
    }
    
}
