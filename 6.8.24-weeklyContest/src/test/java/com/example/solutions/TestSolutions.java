package com.example.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSolutions {

    /**
     * Tests Solution1: Child position after k seconds in a line of n children.
     * Position changes direction at each end of the line.
     * Function: childPosition(n, k)
     * Examples:
     * - (n = 3, k = 5) -> 1
     * - (n = 5, k = 6) -> 2
     * - (n = 4, k = 2) -> 2
     */
    @Test
    public void testSolutionOne() {
        Solution1 solutionOne = new Solution1();
        
        assertEquals(1, solutionOne.numberOfChild(3, 5), "Solution1 Test 1 failed: Expected 1, but got " + solutionOne.numberOfChild(3, 5));
        assertEquals(2, solutionOne.numberOfChild(5, 6), "Solution1 Test 2 failed: Expected 2, but got " + solutionOne.numberOfChild(5, 6));
        assertEquals(2, solutionOne.numberOfChild(4, 2), "Solution1 Test 3 failed: Expected 2, but got " + solutionOne.numberOfChild(4, 2));
    }
    
    /**
     * Tests Solution2: Compute the value of the nth element of an array after k updates,
     * where each update makes a[i] = sum(a[0] to a[i]).
     * Result modulo 10^9 + 7.
     * Function: nthValueAfterKUpdates(n, k)
     * Examples:
     * - (n = 4, k = 5) -> 56
     * - (n = 5, k = 3) -> 35
     */
    @Test
    public void testSolutionTwo() {
        Solution2 solutionTwo = new Solution2();
        
        assertEquals(56, solutionTwo.valueAfterKSeconds(4, 5), "Solution2 Test 1 failed: Expected 56, but got " + solutionTwo.valueAfterKSeconds(4, 5));
        assertEquals(35, solutionTwo.valueAfterKSeconds(5, 3), "Solution2 Test 2 failed: Expected 35, but got " + solutionTwo.valueAfterKSeconds(5, 3));
    }

    /**
     * Tests Solution3: Maximize the total reward by marking unmarked indices i where
     * rewardValues[i] > total reward x, and x += rewardValues[i].
     * Function: maxTotalReward(rewardValues)
     * Examples:
     * - [1,1,3,3] -> 4
     * - [1,6,4,3,2] -> 11
     */
    @Test
    public void testSolutionThree() {
        Solution3 solutionThree = new Solution3();
        
        int[] rewards1 = {1, 1, 3, 3};
        assertEquals(4, solutionThree.maxTotalReward(rewards1), "Solution3 Test 1 failed: Expected 4, but got " + solutionThree.maxTotalReward(rewards1));
        
        int[] rewards2 = {1, 6, 4, 3, 2};
        assertEquals(11, solutionThree.maxTotalReward(rewards2), "Solution3 Test 2 failed: Expected 11, but got " + solutionThree.maxTotalReward(rewards2));
    }
}
