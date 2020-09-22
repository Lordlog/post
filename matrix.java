public class matrix {
    public static void main(String[] args) {
        int firstMatrix[][]={{1,2,3},{4,5,6},{7,8,9}};  
        int secondMatrix[]={10,11,12};  
        int result[]=new int[3];  //store
        //multiplying and printing matrix  
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){  
                result[i]=0;    
                for(int k=0;k<3;k++){
                    result[i]+=firstMatrix[i][k]*secondMatrix[j];    
                }
                System.out.print(result[i]+" ");
            }
            System.out.println();//new line  
        }
    }
}