class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];//creaate a new array 

        int sp =0;//take a starting point
        int ep=n-1;//take an end point

        int idx = n-1;//take an index to store at last on new array
        while(sp<=ep){
            if(nums[sp]*nums[sp] > nums[ep]*nums[ep]){//if arr[sp]*2 > arr[ep]*2
                arr[idx] = nums[sp]*nums[sp];//then store the square of sp to last of arr
                sp++;//start ++
                idx--;//idx--
            }else{
                arr[idx]=nums[ep]*nums[ep];//else if arr[ep]*2 > arr[sp]*2
                ep--;//decrease the ep
                idx--;//decrease the idx
            }
        }
        return arr;//return array
    }
}