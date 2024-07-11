class Solution {
    public int[] replaceElements(int[] arr) {
        //int[] arr1 = new int[arr.length+1];
        int a = arr[arr.length-1];
        for(int i = arr.length-1; i>=0; i--){
            arr[i] = Math.max(arr[i],a);
            a=arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}