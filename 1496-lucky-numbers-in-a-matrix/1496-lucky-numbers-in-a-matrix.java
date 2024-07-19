class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        //in this we create two arraylist one to store min of every row and other to store max of every col
        //then we iterate through matrix and then if matrix[row][col] == min of row00 and max of col then add it in ans and return it
       /* List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;


        List<Integer> rowmin = new ArrayList<>();
        for(int row =0; row<n; row++){
            int min = Integer.MAX_VALUE;
            for(int col=0; col<m; col++){
                min = Math.min(min,matrix[row][col]);
            }
            rowmin.add(min);
        }

        
        List<Integer> colmax = new ArrayList<>();
        for(int col =0; col<m; col++){
            int max = Integer.MIN_VALUE;
            for(int row=0; row<n; row++){
                max = Math.max(max,matrix[row][col]);
            }
            colmax.add(max);
        }

        for(int row= 0; row<n; row++){
            for(int col=0; col<m; col++){
                if(matrix[row][col]==rowmin.get(row)&&matrix[row][col]==colmax.get(col)){
                    ans.add(matrix[row][col]);
                }
            }
        }
        return ans;*/



        //the next approch is that we store 
        //min of every row and max of every col and then we find max among the mins and min among the maxes
         List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;


        int rowminmax = Integer.MIN_VALUE;
        for(int row =0; row<n; row++){
            int min = Integer.MAX_VALUE;
            for(int col=0; col<m; col++){
                min = Math.min(min,matrix[row][col]);
            }
            rowminmax = Math.max(rowminmax,min);
        }

        
        int colmaxmin = Integer.MAX_VALUE;
        for(int col =0; col<m; col++){
            int max = Integer.MIN_VALUE;
            for(int row=0; row<n; row++){
                max = Math.max(max,matrix[row][col]);
            }
            colmaxmin = Math.min(colmaxmin,max);
        }
        
        if(rowminmax==colmaxmin){
            ans.add(rowminmax);
        }
        return ans;
    }
}