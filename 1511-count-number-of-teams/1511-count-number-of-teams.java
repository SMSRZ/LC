class Solution {
    public int numTeams(int[] rating) {
       
        int n = rating.length;

        int ans=0;

        for(int j=1; j<n-1; j++){
        int countleftsmaller = 0;
        int countrightgreater = 0;
        
        int countleftgreater = 0;
        int countrightsmaller = 0;
            //counting left smaller and greater 
            for(int i=0; i<j; i++){
                if(rating[i]<rating[j]){
                    countleftsmaller++;
                }
                else if(rating[i]>rating[j]){
                    countleftgreater++;
                }
            }

            //counting right greater
            for(int k=j+1; k<n; k++){
                if(rating[j]>rating[k]){
                    countrightsmaller++;
                }
                else if(rating[j]<rating[k]){
                    countrightgreater++;
                }
            }

            ans+=(countleftsmaller*countrightgreater) + (countleftgreater*countrightsmaller);
            
        }
        return ans;
    }
}