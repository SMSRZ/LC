class Solution {
    public boolean canConstruct(String s, String t) {
        Map<Character,Integer> hash = new HashMap<>();
        for(char c : t.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0)+1);
        }
        for(char c : s.toCharArray()){
            if(!hash.containsKey(c)||hash.get(c)<=0){
                return false;
            }
            hash.put(c,hash.get(c)-1);
        }
        return true;
    }
}