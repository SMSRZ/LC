class Solution {
    public int majorityElement(int[] nums) {
        /* brute force
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int k : nums) {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int a =0;
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i])>nums.length/2){
                a = nums[i];
            }
        }
        return a;*///moore voting algorithm
        int count =0;
        int maj = nums[0];
        for(int i=0; i<nums.length; i++){
            if(count ==0){
                maj=nums[i];
                count=1;
            }else if(nums[i]==maj){
                count++;
            }else{
                count--;
            }
        }
        return maj;
    }
}