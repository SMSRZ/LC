class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int n : weights){
            max = Math.max(max,n);
            sum += n;
        }
        int low = max;
        int high = sum;
        int ans = -1;
        while(low<=high){
            int mid =(low+high)/2;
            if(daysreq(weights,mid)>days){
                low=mid+1;
            }else{
                ans = mid;
                high=mid-1;
            }
            
        }
        return ans;
    }
        /* //this is the brute force approach
        for(int i=max;i<=sum;i++){
            int daysreq = daysreq(weights,i);
            if(daysreq<=days){
                return i;
            }
        }
        return -1;*/
    static int daysreq(int[] weights,int capacity){
        int days =1;
        int load =0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days++;
                load = weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
}