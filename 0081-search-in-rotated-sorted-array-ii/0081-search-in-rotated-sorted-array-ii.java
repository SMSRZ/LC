class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        boolean present = false;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                present=true;
            }
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target&&target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid]<=target&&target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return present;
    }
}