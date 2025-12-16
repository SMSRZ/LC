class Solution {

    // Decision function:
    // Can Koko eat all bananas at 'speed' within 'h' hours?
    public boolean canEatAll(int[] piles, int speed, int h) {
        int hours = 0;

        for (int bananas : piles) {
            // Number of hours needed for this pile
            hours += bananas / speed;

            // Add extra hour if there is a remainder
            if (bananas % speed != 0) {
                hours++;
            }
        }

        // If total hours fit within h, speed is valid
        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        // Search space boundaries
        int low = 1;               // minimum possible speed
        int high = 0;              // maximum possible speed

        for (int p : piles) {
            high = Math.max(high, p);
        }

        // Binary search on answer
        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid speed works, try smaller speeds
            if (canEatAll(piles, mid, h)) {
                high = mid;
            } 
            // Otherwise, need a higher speed
            else {
                low = mid + 1;
            }
        }

        // low == high is the minimum valid speed
        return low;
    }
}
