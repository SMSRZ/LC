class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n*2];
        int cnt = 0;
        int currones = 0;
        int maxones = 0;
        
        for(int k : nums){
            if(k==1)cnt++;
        }

        for(int i=0; i<2*n; i++){
            temp[i] = nums[i%n];
        }

        int i=0;
        int j=0;

        while(j<temp.length){
            if(temp[j]==1){
                currones++;
            }
            if(j-i+1>cnt){
            currones -= temp[i];
            i++;
            }
            j++;
            maxones = Math.max(maxones,currones);
        }
        return cnt-maxones;
    }
}