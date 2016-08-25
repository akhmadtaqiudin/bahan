/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomethod_lat;

/**
 *
 * @author oto
 */

class Persegi{
    double sisi1,sisi2,sisi3;
    
    void isiData(double s1,double s2,double s3){
        sisi1 = s1;
        sisi2 = s2;
        sisi3 = s3;
    }
    double hitungVolume(){
        double vol = sisi1 * sisi2 * sisi3;
        return vol;
    }
    
}

class PersegiPanjang{
    double panjang;
    double lebar;
    double tinggi;
}

public class DemoMethod_lat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p1,p2,p3;
        p1 = new Persegi();
        p2 = new Persegi();
        p3 = new Persegi();
        
        p1.isiData(5, 5, 5);
        p2.isiData(10, 10, 10);
        p3.isiData(15, 15, 15);
        System.out.println("VOlume Persegi = "+p1.hitungVolume());
        System.out.println("Volume Persegi = "+p2.hitungVolume());
        System.out.println("Volume Persegi = "+p3.hitungVolume());
        
        
    }
    
}
