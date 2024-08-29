class Solution {
    public int minDays(int[] arr, int m, int k) {
        if(m*k>arr.length){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : arr){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        int ans=-1;
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m,k)==true){
                high=mid-1;
                ans = mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] arr,int day,int m,int k){
        int count = 0;
        int nofB=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }else{
                nofB += (count/k);
                count = 0;
            }
        }
        nofB += (count/k);
        if(nofB>=m){
            return true;
        }
        return false;
    }
}