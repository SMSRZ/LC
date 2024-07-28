class Solution {
    public boolean check(int[] nums) {
        //In this approch we check the drops if an array is sorted and rotated it wpuld have at most 1 drop poiny
        //if the array is having more than one dop point then the array was not sorted and we retutn false.....

        int count =0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1])count++;
        }
        if(nums[0]<nums[nums.length-1])count++;

        return count<=1;
    }
}