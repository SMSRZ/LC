class Solution {
    public int maxProduct(int[] nums) {
        int max= nums[0];
        int min = nums[0];
        int res = max;
        for(int i=1;i<nums.length;i++){
            int n = nums[i];
            int tempMax = Math.max(n,Math.max(max*n,min*n));
            min = Math.min(n,Math.min(max*n,min*n));
            max=tempMax;
            res = Math.max(res,max);
        }
        return res;
    }
}