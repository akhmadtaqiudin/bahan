import java.util.Scanner;

public class praktekArray{
    public static void main(String[]arg){
       Scanner masukan= new Scanner(System.in);
        int jumbil, total=0;
        float rata2;
        
        System.out.print("Berapa banyaknya bilangan ?");
        jumbil = masukan.nextInt();
        int data[] = new int[jumbil];
        for(int i=0;i<jumbil;i++){
            System.out.print("Masukan data ke-"+(i+1)+" : ");
            data[i] = masukan.nextInt();
            total=total + data[i];
        }
        System.out.print("Nilai rata-rata dari : ");
        for(int i=0;i<(jumbil-1);i++)
            System.out.print(data[i]+" + ");
        System.out.print(data[jumbil-1] + " adalah ");
        
        rata2=total/jumbil;
        System.out.println(rata2);
    }
}