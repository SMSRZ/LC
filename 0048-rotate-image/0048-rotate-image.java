class Solution {
    public void rotate(int[][] matrix) {

        //taking the transpose of matrix
        for(int i=0;i<matrix.length;i++){
            for (int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       //reversing every row
        for (int i = 0; i < matrix.length; i++) {
            int[] temp = matrix[i];
            int sp=0;
            int ep=temp.length-1;
            while(sp<ep){
                int garbage = temp[sp];
                temp[sp]=temp[ep];
                temp[ep]=garbage;
                sp++;
                ep--;
            }
            matrix[i]=temp;
        }

    }
}