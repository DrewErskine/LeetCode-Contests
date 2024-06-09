package com.example.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSolutions {

    @Test
    public void testSolutionOne() {
        SolutionOne solutionOne = new SolutionOne();
        
        // Example test cases for Solution1
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solutionOne.functionOne(n, k);
        assertEquals(expected, actual, "Solution1 Test 1 failed: Expected " + expected + ", but got " + actual);
    }
    
    @Test
    public void testSolutionTwo() {
        SolutionTwo solutionTwo = new SolutionTwo();
        
        // Example test cases for Solution2
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solutionTwo.functionTwo(n, k);
        assertEquals(expected, actual, "Solution2 Test 1 failed: Expected " + expected + ", but got " + actual);
    }

    @Test
    public void testSolutionThree() {
        SolutionThree solutionThree = new SolutionThree();
        
        // Example test cases for Solution3
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solutionThree.functionThree(n, k);
        assertEquals(expected, actual, "Solution3 Test 1 failed: Expected " + expected + ", but got " + actual);
    }

    @Test
    public void testSolutionFour() {
        SolutionFour solution = new SolutionFour();
        
        // Example test cases for Solution
        int n = 3;
        int k = 3;
        int expected = 0;  // An example expected result
        int actual = solution.functionFour(n, k);
        assertEquals(expected, actual, "Solution Test 1 failed: Expected " + expected + ", but got " + actual);
    }
}
