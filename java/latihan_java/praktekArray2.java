import java.util.Scanner;
public class praktekArray2{
    public static void main(String[]arg){
        int baris,kolom;
        Scanner masukan= new Scanner(System.in);
        System.out.println("Program penjumlahan 2 buah matrix");
        System.out.print("Masukan jumlah baris Matriks: ");
        baris = masukan.nextInt();
        System.out.print("Masukan jumlah kolom mMatriks: ");
        kolom = masukan.nextInt();
        System.out.println();
        System.out.println("Masukan data : ");
        System.out.println("Matriks 1 : ");
        int matriks1[][] = new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("Bil baris ke-"+i+"kolom ke-"+j+" : ");
                matriks1[i][j]=masukan.nextInt();//disini nilai matriks1 yang di input disimpan
                                 }
                                 }
                                 
        System.out.println();
        System.out.println("Matriks 2 : ");
        int matriks2[][]=new int[baris][kolom];
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("Bil baris ke-"+i+" kolom ke-"+j+" : ");
                matriks2[i][j]=masukan.nextInt();//disini nilai matirk2 yang diinput disimpan
            }
        }
System.out.println("Data sebelum dijumlahkan : ");
System.out.println("Matriks 1 : ");
for(int i=0;i<baris;i++){
    for(int j=0;j<kolom;j++)
        System.out.print(matriks1[i][j] + " ");
    System.out.println();
}
System.out.println();
System.out.println("Matriks 2 : ");
for(int i=0;i<baris;i++){
    for(int j=0;j<kolom;j++)
        System.out.print(matriks2[i][j] + " ");
    System.out.println();
}
                                 
System.out.println();
int hasil[][]=new int[baris][kolom];//menginisialisasi variabel hasil harus sama dengan variabel array yang akan dijumlahkan
for(int i=0;i<baris;i++){
    for(int j=0;j<kolom;j++)
        hasil[i][j]=matriks1[i][j] - matriks2[i][j];
}
System.out.println("Hasil pengurangan matriks tersebaut : ");
for(int i=0;i<baris;i++){
    for(int j=0;j<kolom;j++)
        System.out.print(hasil[i][j] + " ");
    System.out.println();
}
System.out.println();
}
}
                                 
        