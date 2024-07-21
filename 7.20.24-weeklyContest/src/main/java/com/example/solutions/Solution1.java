package com.example.solutions;

public class Solution1 {
    public int minChanges(int n, int k) {

        if ((k & ~n) != 0) {
            return -1;
        }

        int changes = 0;
        while (n != k) {

            int diff = n & ~k;
            
            n &= (n - 1);
            changes++;
        }

        return changes;
    }
}
