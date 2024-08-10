class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int k : stones){
            pq.add(k);
        }
        while(pq.size()>1){
            int y = pq.remove();
            int x = pq.remove();
            if(x!=y){
                pq.add(y-x);
            }
        }
        if(pq.size()==0){
            return 0;
        }else{
            return pq.peek();
        }
    }
}