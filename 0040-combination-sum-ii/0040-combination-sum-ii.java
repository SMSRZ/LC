class Solution {
    List<Integer> temp;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,ans);
        return ans;
        
    } 
    void helper(int[] candidates, int target,int idx,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return ;

        }
        for(int i=idx; i<candidates.length; i++ ){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            temp.add(candidates[i]);
            helper(candidates,target-candidates[i],i+1,ans);
            temp.removeLast();
        }
    }
}