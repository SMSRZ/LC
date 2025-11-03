class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right =0 ;
        int ans =0;
        Set<Character> hs = new HashSet();
        while(right<s.length()){
            char c =s.charAt(right);
            if(!hs.contains(c)){
                hs.add(c);
                ans = Math.max(ans,right-left+1);
                right++;
            }else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}