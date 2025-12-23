class Solution {
    public String removeOuterParentheses(String s) {
        //my first approach would be i would take a variable and check if it is opening bracket i would increase it and vice versa 
        //if the variable becomes 0 i would append the substring into a new string if it is possible 

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) sb.append(c);
                count++;
            } else {
                count--;
                if (count > 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}