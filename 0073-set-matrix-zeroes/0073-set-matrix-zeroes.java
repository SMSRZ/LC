class Solution {
    public void setZeroes(int[][] matrix) {
        //this is the brute force approach in which we take the row and col of the element if it is 0 and 
        //covert the whole row and col to 0.......
        /*
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    markrow(matrix,i,m);
                    markcol(matrix,j,n);
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void markrow(int[][] matrix, int i,int m){
        for(int j=0; j<m; j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
     public void markcol(int[][] matrix, int j,int n){
        for(int i=0; i<n; i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }

        }*/

        //second approach
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];   

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}