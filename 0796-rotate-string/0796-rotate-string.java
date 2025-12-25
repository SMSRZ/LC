class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()>goal.length() || s.length()<goal.length()) return false;
        return new String(s+s).contains(goal);
    }
}