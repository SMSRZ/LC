class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1 = new HashMap();
        HashMap<Character,Character> hm2 = new HashMap();

        int m = s.length();
        for(int i=0;i<m;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(hm1.containsKey(ch1) && hm1.get(ch1)!=ch2 || hm2.containsKey(ch2) && hm2.get(ch2)!=ch1) {
                return false;
            }
            hm1.put(ch1,ch2);
            hm2.put(ch2,ch1);
        }
        return true;
    }
}