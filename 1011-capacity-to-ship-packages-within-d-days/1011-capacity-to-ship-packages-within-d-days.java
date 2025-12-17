class Solution {
    public boolean canShip(int[] arr,int mid,int days){
        int sum = 0;
        int count =1;
        for(int n: arr){
            if(sum + n <= mid){
                sum += n;
            }else{
                sum = n;
                count++;
            }
        }
        return count <= days;
    }
    public int shipWithinDays(int[] arr, int days) {
        int low = 0, high = 0;

        for (int n : arr) {
            low = Math.max(low, n); // min capacity
            high += n;              // max capacity
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canShip(arr, mid, days)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}