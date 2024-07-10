class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n: nums){
            if(hs.contains(n)){return true;
            }else{
                hs.add(n);
            }
        }
        return false;
        /*
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;*/
        /*
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int k : nums) {
            if (hm.containsKey(k)){
                int a =hm.get(k);
                hm.put(k,a+1);
            }else{
                hm.put(k,1);
            }
        }
        for (int k:nums) {
            if (hm.get(k)>1){
                return true;
            }
        }
        return false; */
    }

}