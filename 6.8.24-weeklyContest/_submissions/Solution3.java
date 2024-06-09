import java.util.Arrays;

class Solution3 {

    private Integer[][] memo;
    private int maxSum;

    public int maxTotalReward(int[] rewardValues) {
        Arrays.sort(rewardValues);
        maxSum = Arrays.stream(rewardValues).sum();
        memo = new Integer[rewardValues.length][maxSum + 1]; // Key Term - memoization
        return solve(rewardValues, 0, 0);
    }

    private int solve(int[] rewardValues, int index, int currentTotal) {
        if (index == rewardValues.length) {
            return currentTotal;
        }
        if (memo[index][currentTotal] != null) {
            return memo[index][currentTotal];
        }

        // Skip the current reward
        int result = solve(rewardValues, index + 1, currentTotal);

        // Take reward if larget then current
        if (rewardValues[index] > currentTotal) {
            result = Math.max(result, solve(rewardValues, index + 1, currentTotal + rewardValues[index]));
        }

        memo[index][currentTotal] = result;
        return result;
    } 
}
