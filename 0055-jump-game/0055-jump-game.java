class Solution {
    public boolean canJump(int[] nums) {
        int maxidx = 0;
        for(int i=0;i<nums.length;i++){
            if(i>maxidx){
                return false;
            }
            maxidx=Math.max(maxidx,nums[i]+i);
        }
        return true;
    }
}