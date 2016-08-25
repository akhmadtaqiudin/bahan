class arrayDimensi2{
    public static void main(String[]arg){
        int two_dim[][]={{1,2,3,4,5},{10,20,30,40,50},{100,200,300,400,500}};
        
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(two_dim[i][j]+" ");
            }
            System.out.println();
        }
    }
}