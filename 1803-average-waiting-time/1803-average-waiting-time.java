class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int currtime = 0 ;
        double totalwait = 0 ;
        for(int[] customer : customers){
            int arrival = customer[0];
            int cooktime = customer[1];

            if(currtime < arrival){
                currtime = arrival;
            }
            int wait = currtime + cooktime - arrival;
            currtime+=cooktime;
            totalwait += wait;

        }
        return totalwait/n;
    }
}