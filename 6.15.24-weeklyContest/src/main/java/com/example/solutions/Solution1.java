package com.example.solutions;

import java.util.HashMap;

public class Solution1 {
        public int countCompleteDayPairs(int[] hours) {

        // This hashmap will store the counts of each remainder when divided by 24
        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        int pairCount = 0;

        for (int hour : hours) {
            int remainder = hour % 24;

            // Calculate the complement that forms a complete day with current remainder
            int complement = (24 - remainder) % 24;
            if (remainderCount.containsKey(complement)) {
                // Increment pair count by the number of previously seen numbers that can pair with current number
                pairCount += remainderCount.get(complement);
            }

            // Update the hashmap with the current remainder
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        return pairCount;
    }
}


// ---
// Logic Flow:
// 1.
// 2. 
// 3. 
// 4. 
// 5. 