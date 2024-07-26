class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
        for(int k: nums){
            if(Math.abs(k)<Math.abs(closest) || k==Math.abs(closest))
            closest = k;
        }
        return closest;
    }
}