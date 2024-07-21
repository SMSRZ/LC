class Solution {
    public int maxVowels(String s, int k) {
        //this is a classical solution of sliding window pattern in which we declare two variables i and j for
        //two ends of our window and 
        //keep counting character at j if it is a vowel increase the count
        //when you reach window of size k 
                //chech if the character at i is a vowel or not
                    //update the maxv
                    //if it is a vowel decrease the count 
                    //increase the i
        int i=0,j=0,maxv=0,count=0;
        while(j<s.length()){
            if(isvowel(s.charAt(j))){
                count++;
            }
            if(j-i+1==k){
                maxv=Math.max(maxv,count);
                if(isvowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return maxv;
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}