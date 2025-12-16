class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row = nums.length;
        int col = nums[0].length;
        boolean b = false;
        for(int i=row-1 ;i>=0 ;i--){
            if(nums[i][col-1]<target){ continue ;}
            for(int j =col-1;j>=0;j--){
                if(nums[i][j] == target){
                    b=true;
                }
            }
        }
        return b;
    }
}