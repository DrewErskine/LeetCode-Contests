package com.example.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSolutions {

    /**
     * Test for Problem 1: [Number of Bit Changes to Make Two Integers Equal]
     */
    @Test
    public void testsolutionOne() {
        Solution1 solutionOne = new Solution1();
        assertEquals(2, solutionOne.problem1Method(13, 4));
    }
}
