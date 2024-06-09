package com.example.solutions;

public class Solution1 {

    /**
     * Calculates the final position of a child in a circle after moving k steps,
     * considering a reversal in counting direction at each cycle end. This function
     * simulates a variant of the Josephus problem with alternating directions.
     * The calculation uses modular arithmetic to determine the child's position
     * within each cycle, defined by twice the number of children minus two.
     *
     * @param n Total number of children in the circle.
     * @param k Total steps to move in the circle.
     * @return The position of the child after k steps.
     */
    public int numberOfChild(int n, int k) {
        int cycleLength = 2 * (n - 1); // Cycle length is defined as two rounds minus the last position.
        int p = k % cycleLength; // Current position in the cycle after k steps.
        if (p < n) {
            return p; // No reversal in direction, direct position.
        } else {
            return cycleLength - p; // Reverse direction calculation.
        }
    }
}


// ---
// Logic Flow:
// 1. Calculate the total length of each cycle as double the number of children minus two.
// 2. Use modular arithmetic to find the child's position in the current cycle after k steps.
// 3. Determine if the current step requires reversing the direction based on the position in the cycle.
// 4. If in the first half of the cycle, return the position directly.
// 5. If in the second half, calculate the position by subtracting from the cycle length to simulate reversal.