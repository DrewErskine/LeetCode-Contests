package com.example.solutions;

import java.util.Arrays;

public class Solution3 {

    // Memoization table to store results of subproblems; detailed in "Memoization Table" section
    private Integer[][] memo;
    // Maximum possible sum of all reward values
    private int maxSum;

    /**
     * Utilizes recursive calculations with memoization to find the maximum
     * total reward. The function iteratively explores each reward, choosing to
     * either skip it or add it to the current total if it's larger than the
     * current total, which optimizes the sequence of selections.
     *
     * @param rewardValues - Array of integers representing reward values.
     * @return - The maximum total reward achievable.
     */
    public int maxTotalReward(int[] rewardValues) {
        // Sort the array to handle the rewards in ascending order
        Arrays.sort(rewardValues);

        // Compute the sum of all rewards to determine the range of possible reward totals
        maxSum = Arrays.stream(rewardValues).sum();

        // Initialize the memoization table with dimensions based on the number of rewards and the possible total reward
        memo = new Integer[rewardValues.length][maxSum + 1];

        // Begin the recursive decision-making process from the first reward with no initial total
        return solve(rewardValues, 0, 0);
    }

    /**
     * Determines the maximum reward from a given index by exploring two
     * scenarios: 1. Skipping the current reward, which maintains the current
     * total. 2. Adding the current reward to the total, only if it exceeds the
     * current total, thereby maximizing the reward sequence.
     *
     * @param rewardValues - Sorted array of reward values.
     * @param index - Current index in the reward array.
     * @param currentTotal - Current accumulated total of rewards.
     * @return - The maximum reward achievable from this index.
     */
    private int solve(int[] rewardValues, int index, int currentTotal) {

        // Base case: return the current total when all rewards have been considered
        if (index == rewardValues.length) {
            return currentTotal;
        }

        // Check the memoization table to avoid recomputation of the same state
        if (memo[index][currentTotal] != null) {
            return memo[index][currentTotal];
        }

        // Decision 1: Skip the current reward and proceed to the next
        int result = solve(rewardValues, index + 1, currentTotal);

        // Decision 2: Add the current reward to the total if it is beneficial
        if (rewardValues[index] > currentTotal) {
            result = Math.max(result, solve(rewardValues, index + 1, currentTotal + rewardValues[index]));
        }

        // Save the computed result in the memoization table for future reference
        memo[index][currentTotal] = result;
        return result;
    }
}


// Logic Flow:
// 1. Sort the array of reward values to ensure rewards are considered from smallest to largest
// 2. Initialize a memoization table to store the results of subproblems
// 3. Begin the recursive process from the first reward and an initial total reward of 0.
// 4. At each step, decide whether to skip or take the current reward:
//    - Skipping doesn't change the current total
//    - Taking is only done if the reward is greater than the current total, which then adds to the total
// 5. Use memoization to save results of each state to avoid recalculating and optimize the recursive process
// 6. Return the maximum reward calculated
// Memoization Table Explanation:
// The memoization table `memo` is a 2D array where:
//     - The first dimension ('index') represents the current position within the `rewardValues` array.
//     - The second dimension ('currentTotal') represents the accumulated total reward at that point in the recursive process.
//
// The Memoization Table stores the maximum reward that can be achieved from a given index with a specific accumulated reward:
//     - This table helps in storing results of subproblems, which are the outcomes of recursive calls that have already been computed.
//     - Each element in the table, `memo[index][currentTotal]`, holds the result of the maximum reward obtainable from starting at 'index' with 'currentTotal' as the starting sum of rewards.
//     - When the function `solve` is called with a particular 'index' and 'currentTotal', the function first checks this table. If a previously computed result is available (i.e., the value is not null), it uses this result directly instead of recalculating it. This step significantly reduces the number of recursive calls and, consequently, the computational complexity.
//     - If no result is stored, `solve` performs the necessary calculations (either skipping the current reward or including it if it's larger than 'currentTotal'), stores the result in `memo[index][currentTotal]`, and returns it.
//
// Usage Benefits:
//     - **Efficiency**: Memoization avoids the repeated computation of the same state, thus reducing the overall time complexity from exponential to polynomial.
//     - **Optimization**: It enables solving larger problems that would otherwise be infeasible due to time constraints.
//     - **Scalability**: By caching results, memoization allows the algorithm to scale with larger inputs, as each unique state is computed only once.
