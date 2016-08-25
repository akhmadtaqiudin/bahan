class cobaArray{
public static void main(String[]arg){
 /*   String umur[]=new
    String[100];
    
    umur[0]="enam puluh tahun";
    umur[99]="tiga puluh tahun";
    
    System.out.println(umur[80]);
    
    
 /*   int[] umur = new int[5];
    umur[0]=1;
    umur[1]=2;
    umur[2]=3;
    umur[3]=4;
    umur[4]=5;
    
    for(int i=0;i<5;i++){
        System.out.println(umur[i]);
    }*/
    
   int[] umur = new int[5];
    
    umur[0]=1;
    umur[1]=2;
    umur[2]=3;
    umur[3]=4;
    umur[4]=5;
    
     for(int i=0;i<umur.length;i++){
         System.out.println(umur[i]);
     }
     /*    System.out.println();
    
    String kata="pemrograman java";
    
    System.out.println(kata.length());

    
    System.out.println();
    
    
    String[] hari={"senen","selasa","rabu","kamis","jumat","sabtu","minggu"};
    System.out.println(hari.length);*/
    //elemen 80*90
    int[][] twoD=new int[80][90];
    //karakter array 8*16*24
    char[][][] threeD=new char[8][16][24];
    //String array 4 baris * 2 kolom
    String[][] dogs={{"terry","brown"},{"kristin","white"},{"toby","gray"},{"fido","black"}};
    
    System.out.println(dogs[1][1]);
}
}