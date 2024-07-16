class Solution {
    public int longestConsecutive(int[] nums) {/*
        //the most naive approach is that we can use linear search to get x,x+1,x+2.....
        //if the element is found then increase the count
        if(nums.length==0)return 0;
        int longest = 1;
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            int count = 1;
            while(linearsearch(nums,x+1)==true){
                count++;
                x+=1;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
    public boolean linearsearch(int[] nums, int a){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a){
                return true;
            }
        }
        return false;*/
        Arrays.sort(nums);
        if(nums.length==0){return 0;}
        int count=1;
        int longest=1;
        int lastsmaller = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==lastsmaller+1){
                lastsmaller+=1;
                count++;
            }else if(nums[i]!=lastsmaller){
                lastsmaller=nums[i];
                count=1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}