package com.example.solutions;
class Solution2 {
    private static final int MOD = 1000000007;

    public int valueAfterKSeconds(int n, int k) {
        return (int) (binomialCoefficient(k + n - 1, n - 1) % MOD);
    }

    private long binomialCoefficient(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) % MOD;
            result = result * modularInverse(i, MOD) % MOD;
        }
        return result;
    }

    private long modularInverse(int a, int m) {
        // Extended Euclidean algorithm to find modular inverse
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;
        if (m == 1)
            return 0;
        while (a > 1) {
            // q is quotient
            q = a / m;
            t = m;
            // m is remainder now, process same as Euclid's algorithm
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }
        // Make x1 positive
        if (x1 < 0)
            x1 += m0;
        return x1;
    }
}
