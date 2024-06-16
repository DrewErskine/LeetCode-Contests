package com.example.solutions;

public class Solution2 {
    public long countCompleteDayPairs(int[] hours) {
        long[] countRemainders = new long[24];
        long result = 0;

        for (int hour : hours) {
            int remainder = hour % 24;
            countRemainders[remainder]++;
        }

        result += (countRemainders[0] * (countRemainders[0] - 1)) / 2;

        for (int r = 1; r < 12; r++) {
            result += countRemainders[r] * countRemainders[24 - r];
        }

        result += (countRemainders[12] * (countRemainders[12] - 1)) / 2;

        return result;
    }
}


// ---
// Logic Flow:
// 1.
// 2. 
// 3. 
// 4. 
// 5. 