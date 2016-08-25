class matrixArray{
    public static void main(String[]arg){
        int matrik[][]={{1,2,3,4},{8,9,10,11},{11,12,13,14},{17,18,19,20}};
        
        for(int x=0;x<matrik.length;x++){
            for(int y=0;y<matrik[x].length;y++){
                System.out.print(matrik[x][y] + " ");
            }
            System.out.println("     ");
        }
        
        
    }
}