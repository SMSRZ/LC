class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //first make a hashmap and then for every string convert it to a charArray and then sort it make a new Sorted string and then 
        //check if the sorted string is present as a key add it by.putIfAbsent and then return the map.values()
        Map<String,List<String>> hm = new HashMap();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            
            hm.putIfAbsent(sorted,new ArrayList());
            hm.get(sorted).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}