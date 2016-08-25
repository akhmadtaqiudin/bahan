/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


class Kotak{
    double panjang;
    double lebar;
    double tinggi;
    
   
}
public class DemoKotak1 {
    public static void main(String[]args){
        double volume1,volume2;
        
        Kotak k1,k2;
        
        k1 = new Kotak();
        k2 = k1;
        //mengisikan nilai ke dalam objek k1
        k1.panjang = 8;
        k1.lebar = 5;
        k1.tinggi = 7;
        //menghitung isi/volume dari objek k1
        volume1 = k1.panjang * k1.lebar * k1.tinggi;
        //menghitung isi/volume dari objek k2
        volume2 = k2.panjang * k2.lebar * k2.tinggi;
        
        //menampilkan  nilai volume k1 dan k2 ke layar monitor
        System.out.println("Volume k1 = "+volume1);
        System.out.println("Volume k2 = "+volume2);
    }
    
}
