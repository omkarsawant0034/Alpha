public class DiagonalSum {

    public static int diagonalSum(int [][]matrix){
        
        int diaSum = 0;
        
        /* 
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j){
                    diaSum += matrix[i][j];
                }else if((i+j) == matrix.length-1){
                    diaSum += matrix[i][j];
                }
            }
        } 
        */

        for(int i = 0; i < matrix.length; i++){
            diaSum += matrix[i][i];
            if( i != matrix.length-1-i){
                diaSum += matrix[i][matrix.length-1-i];
            }
                
        }

        return diaSum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // diagonalSum(matrix);
        System.out.println("Diagonal Sum is : "+diagonalSum(matrix));
    }
}
