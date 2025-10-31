class Solution {
    public void rotate(int[] arr, int k) {
        k = k% arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public void reverse(int[] arr,int low,int high){
        int i=low;
        int j=high;
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}