class Solution {
    public int[] rearrangeArray(int[] nums) {
        //int this brute force approach we create two arrays for positives and
        // negatives then we store these elements in nums on even and odd places 
        /*
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int k : nums){
            if(k>0){
                pos.add(k);
            }else{
                neg.add(k);
            }
        }
        for(int i=0;i<nums.length/2; i++){
            nums[2*i] = pos.get(i);
            nums[(2*i)+1] = neg.get(i);
        }
        return nums;*/
        int[] ans = new int[nums.length];
        int posindex = 0;
        int negindex = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                ans[negindex] = nums[i];
                negindex+=2;
            }else{
                ans[posindex] = nums[i];
                posindex+=2;
            }
        }
        return ans;
        }
    }
