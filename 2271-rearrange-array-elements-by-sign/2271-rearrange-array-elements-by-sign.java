class Solution {
    public int[] rearrangeArray(int[] nums) {
        //First make two lists that contains positive and negative element 
        //then create a new array and then add the elements one by one 
        //return the array
        ArrayList<Integer> pos = new ArrayList();
        ArrayList<Integer> neg = new ArrayList();
        for(int n : nums){
            if(n>0){
                pos.add(n);
            }
            if(n<0){
                neg.add(n);
            }
        }
        int[] res = new int[nums.length];
        int k=0;
        int c=0;
        while(c<pos.size()){
            res[k]=pos.get(c);
            res[k+1]=neg.get(c);
            k+=2;
            c++;
        }
        return res;
    }
}