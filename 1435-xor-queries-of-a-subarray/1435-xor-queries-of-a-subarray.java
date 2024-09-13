class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for(int i=1;i<arr.length;i++){
            arr[i]^=arr[i-1];
        }
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            if(a==0){
                ans[i]=arr[b];
            }else{
                ans[i]=arr[b]^arr[a-1];
            }
            
        }
        return ans;
        /*
        int n = queries.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int ans = 0;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                ans^=arr[j];
            }
            result[i]=ans;
        }
        return result;
        */
    }
}