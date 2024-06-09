package com.example.solutions;

public class Solution1 {

    /**
     * Calculates the position of a child in a circle after k steps, considering
     * a reversal in counting direction at each cycle end.
     *
     * @param n Total number of children.
     * @param k Total steps to move.
     * @return The position of the child after k steps.
     */
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
