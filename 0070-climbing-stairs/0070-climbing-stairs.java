class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = stairhelper(n,dp);
        return ans;
    }
    public int stairhelper(int n, int[] dp){
        if(n==1||n==2){return n;}
        if(dp[n]!=-1){return dp[n];}

        dp[n]= stairhelper(n-1,dp)+stairhelper(n-2,dp);
        return stairhelper(n-1,dp)+stairhelper(n-2,dp);
    }
}