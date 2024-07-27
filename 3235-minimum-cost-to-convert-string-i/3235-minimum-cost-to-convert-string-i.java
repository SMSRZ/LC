class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        //this is a problem of graph 
        //in this we create a matrix[][] and store all the shortest path in that matrix and then if 2 changes are
        //present then we find which is minimum out of both of them and then we count the minimum of both

        //approach 1 if floys waeshall
        //approch 2 is Djikstra algorithm

        //Approach 1
        long[][] matrix = new long[26][26];
        long ans =0;

        for(int i=0; i<26; i++){
            Arrays.fill(matrix[i],Integer.MAX_VALUE);
        }

        floydwarshall(matrix,original,changed,cost);

        for(int i=0; i<source.length(); i++){
            if(source.charAt(i)==target.charAt(i)){
                continue;
            }

            if(matrix[source.charAt(i)-'a'][target.charAt(i)-'a']==Integer.MAX_VALUE){
                return -1;
            }
            else{
                ans+=matrix[source.charAt(i)-'a'][target.charAt(i)-'a'];
            }
        }
        return ans;
    }


    public void floydwarshall(long[][] matrix, char[] original,char[] changed,int[] cost){
        for(int i=0; i<original.length; ++i){
            int s = original[i]-'a';
            int t = changed[i]-'a';

            matrix[s][t] = Math.min(matrix[s][t],cost[i]);
        }

        for(int k=0;k<26;++k){
            for(int s=0;s<26;++s){
                for(int t=0;t<26;++t){
                    matrix[s][t] = Math.min( matrix[s][t],matrix[s][k]+matrix[k][t]);
                }
            }
        }
    }
}