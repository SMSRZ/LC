class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row= nums.length;
        int col = nums[0].length;
        
        int start = 0;
        int end  = row*col-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid/col][mid%col] > target) end = mid-1;
            else if (nums[mid/col][mid%col]<target) start = mid+1;
            else return true;
        }
        return false;
        //This is a very naive solution but its also fast but not like the binary search
        // int row = nums.length;
        // int col = nums[0].length;
        // boolean b = false;
        // for(int i=row-1 ;i>=0 ;i--){
        //     if(nums[i][col-1]<target){ continue ;}
        //     for(int j =col-1;j>=0;j--){
        //         if(nums[i][j] == target){
        //             b=true;
        //         }
        //     }
        // }
        // return b;
    }
}