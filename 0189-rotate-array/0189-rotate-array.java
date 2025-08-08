class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate(0,nums.length-1,nums);
        rotate(0,k-1,nums);
        rotate(k,nums.length-1,nums);
    }
    public void rotate(int i,int j,int[] nums){
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}