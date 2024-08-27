class Solution {
    public int singleNonDuplicate(int[] arr) {
         int n = arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0]!=arr[1])return arr[0];
        if(arr[n-1]!=arr[n-2])return arr[n-1];
        int low = 2;
        int high = n-3;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid]==arr[mid-1]){mid--;}
            if(mid%2==0){
                low = mid +2;
            }else{
                high=mid-1;
            }
        }
        return arr[low];
    }
}