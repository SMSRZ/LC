class Solution {
    public int minNumberOfFrogs(String st) {
        int c=0,r=0,o=0,a=0,k=0;

        int currfrogs = 0;
        int ans = -1;

        for(char ch : st.toCharArray()){
            switch(ch){
                case'c':
                    currfrogs++;
                    c++;
                    break;
            
                case'r':
                    r++;
                    break;
                
                case'o':
                    o++;
                    break;
                
                case'a':
                    a++;
                    break;
                
                case'k':
                    k++;
                    currfrogs--;
                    break;
                
            }
            ans = Math.max(ans,currfrogs);
            if(c<r||r<o||o<a||a<k){
                return -1; 
            }
        }
        if(currfrogs==0){
            return ans;
        }
        return -1;
    }
}