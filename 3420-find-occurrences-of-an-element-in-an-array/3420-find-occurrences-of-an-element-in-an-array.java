class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> ll = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                ll.add(i);
            }
        }
        int[] res  = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int occurenceIndex = queries[i]-1;
            if(occurenceIndex < ll.size()){
                res[i]=ll.get(occurenceIndex);
            }else{
                res[i]=-1;
            }
        }
        return res;
    }
}