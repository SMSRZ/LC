class Solution {
    public int numIdenticalPairs(int[] nums) {
        /* this approach is not good because it is having o(n2) time complexity
    int count = 0;
    for(int i =0; i<nums.length-1;i++){
        for(int j=i+1;j<nums.length; j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }
    }
    return count;*/
    Map<Integer,Integer> hm = new HashMap<>();
    int ans = 0;
    
    for(int k : nums){
        int count= hm.getOrDefault(k,0);
        ans+=count;
        hm.put(k,count+1);
    }
    return ans;
}
}