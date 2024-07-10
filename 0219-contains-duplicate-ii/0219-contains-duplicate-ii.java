class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        /*
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])){
                hm.put(arr[i],i);
            }else {
                int pastindex = hm.get(arr[i]);
                if (Math.abs(pastindex-i)<=k){return true;}
                else{hm.put(arr[i],i);}
            }
        }
        return false;
        */
        HashSet<Integer> hs = new HashSet<>();//sliding window
        int i =0;
        int j=0;
        while (j<arr.length){
            if (j-i>k){
                hs.remove(arr[i]);
                i++;//shrink the window
            }
            if (hs.contains(arr[j])){
                return true;
            }else {
                hs.add(arr[j]);
                j++;
            }
        }
        return false;
    }
}