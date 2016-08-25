class cobaArray2{
public static void main(String[]arg){
    //deklarasi array multidimensi
    String[][] entry={{"Florence","735-1234","Manila"},{"Joyce","983-3333","Quezon City"},{"Becca","456-3322","Manila"}};
    
    //mengmabil nilai array kemudian menampilkannya pada console
    for(int i=0;i<entry.length;i++){
        for(int j=0;j<entry.length;){
            System.out.println("Name :"+entry[i][j]);
            System.out.println("Telp# :"+entry[i][j++]);
            System.out.println("Addres :"+entry[i][j++]+"\n");
                               }
                               }
}
}