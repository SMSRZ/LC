class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hm= new HashMap<>();
        for(int n:arr){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        List<Integer> ll = new ArrayList();
        for(int n : hm.keySet()){
            if(ll.contains(hm.get(n))){
                return false;
            }else{
                ll.add(hm.get(n));
            }

        }
        return true;
    }
}