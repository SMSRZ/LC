class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        //check if the combination of string s + s contains the goal if it contains goal return true else return false;;;;
        String combi = s+s;
        if(combi.contains(goal)){
            return true;
        }
        return false;
    }
}