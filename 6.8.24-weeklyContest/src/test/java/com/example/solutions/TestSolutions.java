package com.example.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSolutions {

    @Test
    public void testSolutionOne() {
        Solution1 solutionOne = new Solution1();
        
        // Example test cases for Solution1
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solutionOne.functionOne(n, k);
        assertEquals(expected, actual, "Solution1 Test 1 failed: Expected " + expected + ", but got " + actual);
    }
    
    @Test
    public void testSolutionTwo() {
        Solution2 solutionTwo = new Solution2();
        
        // Example test cases for Solution2
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solutionTwo.functionTwo(n, k);
        assertEquals(expected, actual, "Solution2 Test 1 failed: Expected " + expected + ", but got " + actual);
    }

    @Test
    public void testSolutionThree() {
        Solution3 solutionThree = new Solution3();
        
        // Example test cases for Solution3
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solutionThree.functionThree(n, k);
        assertEquals(expected, actual, "Solution3 Test 1 failed: Expected " + expected + ", but got " + actual);
    }

    @Test
    public void testSolutionFour() {
        Solution4 solution = new Solution4();
        
        // Example test cases for Solution
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solution.functionFour(n, k);
        assertEquals(expected, actual, "Solution Test 1 failed: Expected " + expected + ", but got " + actual);
    }
}
