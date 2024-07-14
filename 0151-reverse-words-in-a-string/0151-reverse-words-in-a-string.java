class Solution {
    public String reverseWords(String s) {/*
        //brute force firstly trim the string and then split by single or
        // multiple spaces using \\s+ it is used to split by singlr or multiple spaces
        String[] str = s.trim().split("\\s+");
        String out = "";
        for(int i = str.length-1; i>0; i--){
            out+=str[i]+ " ";
        }
        return out + str[0];*/
        String[] words= s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            if(!words[i].isEmpty()){
                sb.insert(0,words[i]);
                if(i<words.length-1){
                    sb.insert(0," ");
                }
            }
        }
        return sb.toString();
        
    }
}