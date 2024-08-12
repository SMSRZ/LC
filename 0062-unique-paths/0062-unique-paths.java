class Solution {
    
    public int uniquePaths(int m, int n) {
        int dp[][] = new int [m][n];
        for(int i= 0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return pathhelper(dp,m-1,n-1);
    }
    public int pathhelper(int[][] dp ,int m,int n){
        if(m<0||n<0)return 0;
        if(m==0&&n==0)return 1;
        if(dp[m][n]!=-1)return dp[m][n];
        int x = pathhelper(dp,m-1,n);
        int y = pathhelper(dp,m,n-1);
        dp[m][n] = x+y;
        return x+y;
    }
}