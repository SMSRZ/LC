class Solution {
    public String largestOddNumber(String num) {
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i = num.length()-1;i>=0;i--){
            int a = num.charAt(i)-'0';
            if(a%2!=0){
                flag = true;
            }
            if(flag){
                sb.append(String.valueOf(a));
            }
        }
        return sb.reverse().toString();
    }
}