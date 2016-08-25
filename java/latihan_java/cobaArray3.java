class cobaArray3{
    public static void main(String[]arg){
        
        String[][] belanja={{"led TV","1","3.000.000","baru"},{"laptop asus","1","5.000.000","baru"},{"mesin cuci","1","1.500.000","baru"},{"kulkas","1","1.000.000","baru"},{"air conditioner","1","2.500.000","baru"},{"home teatre","1","2.000.000","baru"}};
        
    String total=(double).belanja[0][2]+belanja[1][2]+(belanja[2][2])+(belanja[3][2])+(belanja[4][2])+(belanja[5][2]);
for(int m=0;m<belanja.length;m++){
    for(int n=0;n<belanja[m].length;n++){
        System.out.println("jenis barang :"+belanja[m][n++]);
        System.out.println("jumlah barang :"+belanja[m][n++]);
        System.out.println("harga barang :"+belanja[m][n++]);
        System.out.println("kondisi      :"+belanja[m][n++]+"\n");
        
        
                                                       }
                                                       }
    System.out.println("Total harga :"+total);                                                   }
                                                       }
                                                       