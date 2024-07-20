class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        
        for(int sp=0; sp<nums.length; sp++){
            if(nums[sp]==target){
                ans[0]=sp;
                break;
            }
        }
        for(int ep=nums.length-1; ep>=0; ep--){
            if(nums[ep]==target){
                ans[1]=ep;
                break;
            }
        }
        return ans;
        //i have currently not learned binary search but i have solved it in o(n) time above i will revisit it later
    }
}