class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        if(target<nums[0]){
            return 0;
        }
        int low=0;
        int high=nums.length-1;
        int ans=-1;
         while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (nums[mid] >= target) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
        /*
        //this is a iterative approach
       int temp=0;
      // boolean b = false;
        for (int i =0 ;i< nums.length;i++){
           if (nums[i]==target){
               temp=i;
           }
           else if (target >= (nums[i])) {
               temp=i+1;
              // b=true;
           }
           
        }
        return temp;
    }
}*/