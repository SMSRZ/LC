class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] res = new int[2];
        // int i=0;
        // int j=nums.length-1;
        // while(i<j){
        //     int mid = (i+j)/2;
        //     if(nums[i]+nums[mid]>target){
        //         j=mid-1;
        //     }else if(nums[i]+nums[mid]<target){
        //         i=mid+1;
        //     }else{
        //         return new int[] {i+1,mid+1};
        //     }
        // }
        // return new int[] {};

        //in this questions we can use binary search but i am using two pointers

        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int curr = nums[i]+nums[j];
            if(curr==target){
                return new int[] {i+1,j+1};
            }else if (curr>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {};
    }
}