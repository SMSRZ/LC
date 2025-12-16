class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target > letters[letters.length-1] || (target < letters[0])) return letters[0];
        
        int low = 0;
        int high = letters.length-1;
        char ans = letters[0];
        while(low<=high){
            int mid= low + (high-low)/2;
            if(target < letters[mid]){
                ans = letters[mid];
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}