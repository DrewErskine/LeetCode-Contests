package com.example.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSolutions {

    /**
     * Tests Solution1: 
     * Function: countCompleteDayPairs
     * Examples:
     * - Input: [12, 12, 30, 24, 24], Output: 2
     * - Input: [72, 48, 24, 3], Output: 3
     * - Input: [12, 24, 36, 48], Output: 3
     */
    @Test
    public void testSolutionOne() {
        Solution1 solution1 = new Solution1();
        assertEquals(2, solution1.countCompleteDayPairs(new int[]{12, 12, 30, 24, 24}));
        assertEquals(3, solution1.countCompleteDayPairs(new int[]{72, 48, 24, 3}));
    }
    
    /**
     * Tests Solution2: 
     * Function: countCompleteDayPairs
     * Examples:
     * - Input: [12, 12, 30, 24, 24], Output: 2
     * - Input: [72, 48, 24, 3], Output: 3
     * - Input: [12, 24, 36, 48], Output: 3
     */
    @Test
    public void testSolutionTwo() {
        Solution2 solution2 = new Solution2();
        assertEquals(2, solution2.countCompleteDayPairs(new int[]{12, 12, 30, 24, 24}));
        assertEquals(3, solution2.countCompleteDayPairs(new int[]{72, 48, 24, 3}));
        
    }

    /**
     * Tests Solution3: 
     * Function: maximumTotalDamage
     * Examples:
     * - Input: [1, 1, 3, 4], Output: 6
     * - Input: [7, 1, 6, 6], Output: 13
     * - Input: [1, 2, 3, 4, 5, 6, 7, 8, 9], Output: 25
     */
    @Test
    public void testSolutionThree() {
        Solution3 solution3 = new Solution3();
        assertEquals(6, solution3.maximumTotalDamage(new int[]{1, 1, 3, 4}));
        assertEquals(13, solution3.maximumTotalDamage(new int[]{7, 1, 6, 6}));
        
    }
}
