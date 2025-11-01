class Solution {
    public int maxArea(int[] arr) {
    int i = 0;
    int j = arr.length - 1;
    int res = 0;
    while (i < j) {
        int currArea = Math.min(arr[i], arr[j]) * (j - i);
        res = Math.max(res, currArea);
        if (arr[i] < arr[j]) {
            i++;
        } else {
            j--;
        }
    }
    return res;
}
}