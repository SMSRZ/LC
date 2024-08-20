class Solution {
    public int minSteps(int n){

        //bottom up + greedy

        if(n==1){
            return 0;
        }
        
        if(n==2){
            return 2;
        }

        int[] t = new int[n+1];
        t[0]=0;
        t[1]=0;
        t[2]=2;


        for(int i=3;i<=n;i++){
            int factor = i/2;
            while(factor >= 1){
                if(i%factor==0){
                    int steps_to_print_factor_As = t[factor];
                    int copy = 1;
                    int paste = ((i/factor)-1);

                    t[i]=steps_to_print_factor_As + copy + paste;
                    break;
                }
                factor--;
            }
        }
        return t[n];
    }
}
/*
    //Recursion + dp
    int[][] dp =  new int[1001][1001];
    public int minSteps(int n) {
        
        if(n==1){
            return 0; //already 1 in notepad
        }

        for(int i=0;i<1001;i++){
            for(int j=0;j<1001;j++){
            dp[i][j]=-1;
        }
        }

        return 1+minstephelper(n,1,1);
    }
    int minstephelper(int n,int currA,int clipA){
       
        if(currA==n){//if the value of currA id equal to n then there is no need for furthrt operations 
            return 0;
        }

        if(currA>n){//if currA becomes greater than n then we return some larger value.
            return 100000;
        }

        if(dp[currA][clipA]!=-1){
            return dp[currA][clipA];
        }
        int copyallpaste = 1+1+minstephelper(n,currA+currA,currA);//copy all content of notepad on clipboard
        //then paste it on notepad it involves 1 for copy 1  for paste currA will become 2 * currA and clipboard will have currA
        int paste = 1+minstephelper(n,currA+clipA,clipA);// it involves only one operation that is paste and it uses only 1 so +1 and the note pad will have currA + clipboard 

        dp[currA][clipA] = Math.min(copyallpaste,paste);
        return Math.min(copyallpaste,paste);//returns the minimum of both of them
    }
}
*/