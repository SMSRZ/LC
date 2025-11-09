class Solution {
    public int longestPalindrome(String s) {
        Set<Character> hs = new HashSet();
        int count = 0;
        for(char c : s.toCharArray()){
            if(!hs.contains(c)){
                hs.add(c);
            }else{
                hs.remove(c);
                count+=2;
            }
        }
        if(hs.size()!=0){
            return count+1;
        }
        return count;
    }
}