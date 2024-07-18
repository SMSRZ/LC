class Solution {
    public int trap(int[] height) {
        int amount = 0;
        int[] pfmax = new int[height.length];
        int[] sfmax = new int[height.length];
        pfmax[0] = height[0];
        sfmax[height.length-1] = height[height.length-1];
        for(int i=1; i<height.length; i++){
            pfmax[i] = Math.max(height[i],pfmax[i-1]);
        }
        for(int i=height.length-2; i>=0; i--){
            sfmax[i] = Math.max(height[i],sfmax[i+1]);
        }
        for(int i=1; i<height.length-1; i++){
            int lb = pfmax[i-1];
            int rb = sfmax[i+1];
            int yb = Math.min(lb,rb);
            int contri = yb - height[i];
            if(contri>0){
                amount+=contri;
            }
        }
        return amount;
    }
}