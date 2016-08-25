/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoparameterobjek2;

/**
 *
 * @author oto
 * 
 * 
 */
class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    
    //constructor dengan parameter bertipe double
    Kotak(double p,double l,double t){
        panjang = p;
        lebar = l;
        tinggi = l;
    }
    
    //constructor dengan parameter bertipe objek Kotak
    Kotak(Kotak k){
        this.panjang = k.panjang;
        this.lebar = k.lebar;
        this.tinggi = k.tinggi;
    }
    
    double hitungVolume(){
        return(panjang * lebar * tinggi);
        
    }
    
    //mendefinisikan method dengan parameter objek Kotak
    boolean sama(Kotak k){
        if((k.panjang == this.panjang)&&
                (k.lebar == this.lebar)&&
                (k.tinggi == this.tinggi)){
            return true;
        }else{
            return false;
        }
    }
}
public class DemoParameterObjek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k1,k2;
        
        k1 = new Kotak(4,3,2);
        
        //Membentuk objek k2 dengan nilai yang terdapat pada k1
        k2 = new Kotak(k1);
        
        System.out.println("k1 == k2 : "+k1.sama(k2));
        System.out.println("volume k1 = "+k1.hitungVolume());
        System.out.println("Volume k2 = "+k2.hitungVolume());
        
    }
    
}
