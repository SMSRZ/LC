class Solution {
    public int maximumDifference(int[] nums) {
        /*
        int ans =-1;
        int a=0;
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    a = Math.abs(nums[i]-nums[j]);
                    ans = Math.max(ans,a);
                }   
            }
        }
        return ans;*/
        int min =nums[0];
        int ans = -1;
        for(int i=1; i<nums.length; i++){
            min = Math.min(min,nums[i]);
            ans = Math.max(ans,nums[i]-min);
        }
        if(ans == 0){
            return -1;
        }else{
            return ans;
        }
    }
}