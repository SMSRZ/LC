class Solution {
    public List<Integer> findAnagrams(String s2, String s1) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        List<Integer> ll = new ArrayList();
        for(char c : s1.toCharArray()){
            freq1[c-'a']++;
        }
        int window = s1.length();
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            if(i>=window){
                freq2[s2.charAt(i-window)-'a']--;
            }
            if(Arrays.equals(freq1,freq2)){
                ll.add(i-window+1);
            }
        }
        return ll;
    }
}