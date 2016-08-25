/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoparameterobjek;

/**
 *
 * @author oto
 */
class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    
    Kotak(double p,double l,double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double hitungVolume(){
        return(panjang * lebar * tinggi);
    }
    
    //mendefinisikan method dengan parameter objek kotak
    boolean sama(Kotak k){
        if((k.panjang == this.panjang) &&
                (k.lebar == this.lebar) &&
                (k.tinggi == this.tinggi)){
            return true;
        }else{
            return false;
        }
    }
}
public class DemoParameterObjek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k1,k2,k3,k4;
        
        k1 = new Kotak(4,3,2);
        k2 = new Kotak(6,5,4);
        k3 = new Kotak(4,3,2);
        k4 = new Kotak(6,5,4);
        
        System.out.println("k1 == k2 : "+k1.sama(k2));
        System.out.println("k1 == k3 : "+k1.sama(k3));
        System.out.println("k2 == k4 : "+k2.sama(k4));
    }
    
}
