class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs  = new HashSet();
        for(int n : nums1){
            hs.add(n);
        }
        List<Integer> ll = new ArrayList<>();
        for(int n : nums2){
            if(hs.contains(n)&&!ll.contains(n)){
                ll.add(n);
            }
        }
        int[] res = new int[ll.size()];
        int i =0;
        for(int n : ll){
            res[i++]=n;
        }
        return res;
    }
}