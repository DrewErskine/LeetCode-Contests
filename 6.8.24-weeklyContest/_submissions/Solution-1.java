class Solution {
    public int numberOfChild(int n, int k) {
        int cycleLength = 2 * (n - 1);
        int p = k % cycleLength;
        if (p < n) {
                return p;
        } else { 
            return cycleLength - p;
        }
    }
}