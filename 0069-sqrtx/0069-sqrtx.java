class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int low = 1;
        int high = x/2;
        while(low<=high){
            int mid = (low+high)/2;
            long sqr = (long)mid*mid;
            if(sqr == x) return mid;
            else if(sqr < x) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
}