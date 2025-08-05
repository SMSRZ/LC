class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int posIdx = 0;
        int negIdx = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[posIdx]=nums[i];
                posIdx+=2;
            }
            if(nums[i]<0){
                res[negIdx]=nums[i];
                negIdx+=2;
            }
        }
        return res;
    }
}