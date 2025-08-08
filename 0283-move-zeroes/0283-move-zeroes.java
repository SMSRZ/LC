class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j = 1;
        while(i<j&&j<nums.length){
            if(nums[i]==0){
                while(nums[j]==0&&j<nums.length-1){
                    j++;
                }
                swap(nums,i,j);
            }
            i++;
            j++;
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}