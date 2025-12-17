class Solution {
    public boolean isValid(int[] arr ,int mid , int threshold){
        int sum = 0;
        for(int n : arr){
            if(n%mid==0){
                sum+=n/mid;
            }else{
                sum+=(n/mid)+1;
            }
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1,high=0;
        for(int n : nums){
            high = Math.max(high,n);
        }
        while(low<high){
            int mid = low + (high-low)/2;
            if(isValid(nums,mid,threshold)){
                high  = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}