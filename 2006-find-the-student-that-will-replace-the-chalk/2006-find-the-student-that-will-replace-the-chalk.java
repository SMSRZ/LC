class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        /*
        while(true){
            for(int i=0;i<chalk.length;i++){
                if(k<chalk[i]){
                    return i;
                }
                k-=chalk[i];
            }
        }*/
        int sum = 0;
        for(int i =0;i<chalk.length;i++){
            sum+=chalk[i];
            if(sum>k){
                return i;
            }
        }
        int remain = k%sum;
        for(int i =0;i<chalk.length;i++){
            if(remain<chalk[i]){
                return i;
            }
            remain-=chalk[i];
        }
        return -1;
    }
}