class Solution {
    public int subarraySum(int[] nums, int k) {
        /*brute force
        int count = 0;
        int[] sum =new int [nums.length+1];
        sum[0] = 0 ;
        for(int i = 1;i<=nums.length;i++){
            sum[i] = sum[i-1]+nums[i-1];
        }
        for(int start =0;start<sum.length;start++){
            for(int end = start+1;end<sum.length;end++){
                if(sum[end]-sum[start]==k){count++;}
            }
        }
        return count;*/
        int ans =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(hm.containsKey(sum-k)){
                ans += hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;

    }
}