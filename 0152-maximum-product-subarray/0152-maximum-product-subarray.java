class Solution {
    public int maxProduct(int[] nums) {
        /* this is a better approach
        int ans = Integer.MIN_VALUE;
        int pre = 1;
        int suff = 1;
        for(int i=0;i<arr.length;i++){
            if(pre==0)pre=1;
            if(suff==0)suff=1;
            pre*=arr[i];
            suff*=arr[arr.length-i-1];
            ans = Math.max(ans,Math.max(pre,suff));
        }
        return ans;

        
        //this is modified kadanes algo
        int prod1= arr[0];
        int prod2=arr[0];
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
            prod1 = temp;
            ans = Math.max(ans,prod1);
        }
        return ans;*/
    int ans = nums[0];
    int ma = ans;
    int mi = ans;
    for(int i=1; i<nums.length; i++){
        if(nums[i]<0){
            int temp = ma;
            ma = mi;
            mi = temp;
        }
        ma= Math.max(nums[i],ma*nums[i]);
        mi=Math.min(nums[i],mi*nums[i]);
        ans = Math.max(ans,ma);
    }
    return ans;
    }
     
}