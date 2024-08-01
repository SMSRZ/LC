class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String citizen : details){
            if(citizen.charAt(11)>'6' || citizen.charAt(11)=='6' && citizen.charAt(12)>'0'){
                count++;
            }
        }
        return count;
    }
}