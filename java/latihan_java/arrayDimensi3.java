class arrayDimensi3{
    public static void main(String[]arg){
           int x[][][]={{{1,2,3},{4,5,6},{7,8,9}}};
     for(int m=0;m<3;m++)
           for(int n=0;n<3;n++)
               for(int o=0;o<3;o++){
                   System.out.println(x[m][n][o]+" ");
                   //System.out.println();
                   
               
           }
     
    }
           
       }
     /*   System.out.println();
    
    
       int threeD[][][]=new int[3][4][5];
        
        for(int i=0;i<3;i++)
        for(int j=0;j<4;j++)
        for(int k=0;k<5;k++)
        threeD[i][j][k]=i*j*k;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}*/