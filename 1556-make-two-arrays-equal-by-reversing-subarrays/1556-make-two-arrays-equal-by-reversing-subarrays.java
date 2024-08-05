class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] res = new int[1001];

        for(int k : arr){
            res[k]++;
        }

        
        for(int k : target){
            res[k]--;
        }

        for(int k : res){
            if(k!=0){
                return false;
            }
        }
        return true;
    }
}