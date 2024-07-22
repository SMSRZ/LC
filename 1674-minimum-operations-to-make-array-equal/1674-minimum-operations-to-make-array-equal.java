class Solution {
    public int minOperations(int n) {
        int mid = n/2;
        if(n%2==0){
            return mid*mid;
        }
        return mid*(mid+1);
        /*
        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i]=(2*i)+1;
        }
        int sum=0;
        for(int k : arr){
            sum+=k;
        }
        int target = sum/n;
        int i=0;
        int j=n-1;
        int count = 0;
        while(i<=j){
            if(arr[i]<target&&arr[j]>target){
                arr[i]++;
                arr[j]--;
                count++;
            }else if(arr[i]==target&&arr[j]==target){
                i++;
                j--;
            }
        }
        return count;*/
    }
}