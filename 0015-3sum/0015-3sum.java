class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hss = new HashSet();
            for(int j=i+1;j<nums.length;j++){
                int n = -(nums[i]+nums[j]);
                if(hss.contains(n)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],n);
                    temp.sort(null);
                    hs.add(temp);
                }
                hss.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList(hs);
        return ans;
    }
}