class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        // checking in first row
        boolean firstRowHash =false;
        boolean firstColHash =false;

        // checking 1st row is zero
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstRowHash=true;
            }
        }
        // checking if first column has 0
        for(int i=0;i<m;i++){
            if(matrix[i][0] ==0){
                firstColHash=true;

            }
        }
        // place matrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //  0's place using marker
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //  update first roe/col
        if(firstRowHash){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(firstColHash){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }

    }
}