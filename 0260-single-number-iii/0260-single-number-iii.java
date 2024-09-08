class Solution {
    public int[] singleNumber(int[] nums) {
     int n = nums.length;
        int v = 0;
        for(int i =0;i < n;i++){
          v = v ^ nums[i];
        }

        int idx = 0;
        for(int i=0;i<32;i++){
          if(checkBit(v,i) == true){
            idx = i;
            break;
          }
        }

        int set1 = 0;
        int set2 = 0;

        for(int i=0;i<n;i++){
          if(checkBit(nums[i],idx) == true){
            set2 = set2 ^ nums[i];
          }else{
            set1 = set1 ^ nums[i];
          }
        }

        return new int[]{set1,set2};
    }
      public boolean checkBit(int n, int i){
        if((n & (1<<i)) == 0){
            return false;
        }else{
            return true;
        }
    }


}