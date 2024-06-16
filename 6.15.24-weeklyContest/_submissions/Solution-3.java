import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int p : power) {
            freqMap.put(p, freqMap.getOrDefault(p, 0) + 1);
        }

        List<Integer> uniqueDamages = new ArrayList<>(freqMap.keySet());
        Collections.sort(uniqueDamages);

        int n = uniqueDamages.size();
        long[] dp = new long[n + 1];

        for (int i = 0; i < n; i++) {
            int damage = uniqueDamages.get(i);
            long totalDamage = (long) damage * freqMap.get(damage);

            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            int j = i - 1;
            while (j >= 0 && uniqueDamages.get(j) >= damage - 2) {
                j--;
            }
            dp[i + 1] = Math.max(dp[i + 1], (j >= 0 ? dp[j + 1] : 0) + totalDamage);
        }

        return dp[n];
    }
}
