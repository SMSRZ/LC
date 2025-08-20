class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //Brute 
        // double ans = Double.NEGATIVE_INFINITY;
        // for(int i = 0 ;i <= nums.length - k; i++){
        //     double sum = 0;
        //     for(int j = i;j<i+k;j++){
        //         sum+=nums[j];
        //     }
        //     ans  = Math.max(ans,sum/k);
        // }
        // return ans;
        double sum  = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        double maxSum = sum;
        for(int i =k;i<nums.length;i++){
            sum += nums[i]-nums[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum / k;
    }
}