class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                String word1 = words[i];
                String word2 = words[j];
                if(word1.length()>=word2.length()){
                    continue;
                }
                if(isSubstring(words[i],words[j])){
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
     public boolean isSubstring(String str1, String str2){
        if(str2.contains(str1)){return true;}
        else {return false;}       
    }
}
/*    Set<String> hs = new HashSet<>();
    for(int i=0; i<words.length; i++){
        String word = words[i];
        for(int j=0; j<words.length; j++){
            if(i!=j && words[j].contains(word)){
                hs.add(word);
            }
        }
    }
    return new ArrayList<>(hs);
}*/
