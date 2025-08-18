class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int n : prices){
            min = Math.min(min,n);
            profit = Math.max(profit,n-min);
        }
        return profit;
    }
}