class Solution {
    
    public int countSubstrings(String s) {
        //bottom up
        int n = s.length();
        boolean[][] t = new boolean[n][n];

        int count =0;
        for(int L=1; L<=n; L++){
            for(int i=0; i+L-1<n;i++){
                int j = i+L-1;
                if(i==j){
                    t[i][i] = true;
                }
                else if(i+1==j){
                    t[i][j] = (boolean)(s.charAt(i)==s.charAt(j)); 
                }else{
                    t[i][j] = (s.charAt(i)==s.charAt(j)&&t[i+1][j-1]);
                }
                if(t[i][j]){
                    count++;
                }

            }
        }
        return count;

    }
}
        //brute force
        /*
        int count = 0;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j =i;j<c.length;j++){
                if(check(c,i,j)==true){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean check(char[] c, int sp, int ep){
        if(sp>ep) return true;
        if(c[sp]==c[ep]){
            return check(c,sp+1,ep-1);
        }
        return false;*/
        //bottom up approach
    
