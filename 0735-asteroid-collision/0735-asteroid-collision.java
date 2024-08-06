class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int i= 0;
        Stack<Integer> st = new Stack<>();
        while(i<n){
           if(asteroids[i]<0){
            if(st.size()==0||st.peek()<0){
                st.push(asteroids[i]);
                i++;
            }
            else if(st.peek()>Math.abs(asteroids[i])){
                i++;
            }
            else if(st.peek()<Math.abs(asteroids[i])){
                st.pop();
            }else if(st.peek()==Math.abs(asteroids[i])){
                st.pop();
                i++;
            }
        }else{
                st.push(asteroids[i]);
                i++;
            }
        } 
        int[] ans = new int [st.size()];
        for(int k=ans.length-1;k>=0;k--){
        ans[k]=st.pop();
        }
        return ans;
        
    }
}