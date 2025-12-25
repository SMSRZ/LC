class Solution {
    public String frequencySort(String s) {
        //solution1 hashmap + priority queue
        // HashMap<Character,Integer> hm = new HashMap<>();
        // for(char c : s.toCharArray()){
        //     hm.put(c,hm.getOrDefault(c,0)+1);
        // }
        // PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> hm.get(b)-hm.get(a));
        // pq.addAll(hm.keySet());

        // StringBuilder sb = new StringBuilder();
        // while(!pq.isEmpty()){
        //     char c = pq.poll();
        //     int count = hm.get(c);
        //     while(count-- > 0){
        //         sb.append(c);
        //     }
        // }
        // return sb.toString();

        //solution 2 bucket sort

        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Character>[] buckets = new List[s.length()+1];
        for(char c : hm.keySet()){
            int f = hm.get(c);
            if(buckets[f]==null){
                buckets[f]=new ArrayList<>();
            }
            buckets[f].add(c);
        }        
        StringBuilder sb = new StringBuilder();
        for(int i = buckets.length-1;i>=0;i--){
            if(buckets[i]!=null){
                for (char c : buckets[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}