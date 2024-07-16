class Solution {
    public int longestConsecutive(int[] nums) {
        //optimal approACH
        if(nums.length==0)return 0;
        int longest = Integer.MIN_VALUE;
        Set<Integer> hs = new HashSet<>();
        for(int ele : nums){
           hs.add(ele);
        }
        for(int k : hs){
            if(!hs.contains(k-1)){//if the current element is starting element
            int cnt = 1;//take count
            int x = k;//take current element in variable
            while(hs.contains(x+1)){ // check if there is an element which is 1 greater than starting element 
                x= x+1;//increase the current element to 1
                cnt++;//increment count 
            }
             longest = Math.max(longest,cnt);//tale longest sequence
        }
           
        }
        return longest;
    }
}