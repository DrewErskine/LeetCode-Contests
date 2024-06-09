package com.example.solutions;

public class Solution2 {

    private static final int modulo = 1000000007; // Modulus used for computational arithmetic to prevent overflow.
    private static final int maxTime = 1000; // Maximum time parameter for precomputing factorials.
    private long[] factorial = new long[maxTime + 1]; // Store precomputed factorial values.
    private long[] invFactorial = new long[maxTime + 1]; // Store precomputed inverse factorial values.

    /**
     * Constructor initializes the factorial and inverse factorial arrays used for
     * combinatorial calculations. The inverse factorials are calculated using the
     * extended Euclidean algorithm, allowing efficient computation of combinations.
     */
    public Solution2() {
        factorial[0] = 1; // Base case for factorial.
        for (int i = 1; i <= maxTime; i++) {
            factorial[i] = factorial[i - 1] * i % modulo; // Precompute each factorial modulo 'modulo'.
        }

        for (int i = 0; i <= maxTime; i++) {
            invFactorial[i] = euclideanInverse(factorial[i], modulo); // Precompute inverse factorials.
        }
    }

    /**
     * Calculate the value after k seconds using combinatorial logic. This method
     * considers the permutations of n items over k time steps, using the formula
     * for combinations with repetitions (stars and bars theorem).
     *
     * @param n Number of items.
     * @param k Number of seconds.
     * @return Calculated value using the combination formula.
     */
    public int valueAfterKSeconds(int n, int k) {
        return (int) combine(k + n - 1, n - 1); // Combination with repetition.
    }

    /**
     * Helper method to calculate combinations C(n, k) using precomputed factorials
     * and their inverses. It optimizes calculation by ensuring that the smaller of
     * k and n-k is used in the denominator.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The combination result modulo 'modulo'.
     */
    private long combine(int n, int k) {
        if (k > n - k) {
            k = n - k; // Minimize the denominator.
        }
        long numerator = factorial[n]; // Numerator as factorial of n.
        long denominator = factorial[k] * factorial[n - k] % modulo; // Denominator as product of factorials.
        return numerator * euclideanInverse(denominator, modulo) % modulo; // Combination result.
    }

    /**
     * Calculate the modular inverse of a with respect to modulo m using the
     * extended Euclidean algorithm. This method ensures the efficient computation
     * of division in modular arithmetic, critical for combinatorial calculations.
     *
     * @param a The number to find the inverse of.
     * @param m The modulus.
     * @return The modular inverse of a.
     */
    private long euclideanInverse(long a, long m) {
        long m0 = m, t, q;
        long x0 = 0, x1 = 1;
        if (m == 1) return 0;
        while (a > 1) {
            q = a / m;
            t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }
        if (x1 < 0) x1 += m0;
        return x1;
    }
}


// ---
// Logic Flow:
// 1. Initialize factorials and inverse factorials up to 'maxTime'.
// 2. Compute factorials for all integers up to 'maxTime' using modular arithmetic.
// 3. Calculate inverse factorials using the extended Euclidean algorithm.
// 4. Define the combinatorial function to compute the value after k seconds, which integrates factorial calculations.
// 5. Implement the 'combine' method that computes combinations using precomputed factorials and inverse factorials.
// 6. Handle all combinatorial logic under modular arithmetic to ensure correctness despite potential large number operations.

// Extended Euclidean Algorithm Explanation:
// The euclideanInverse function uses the extended Euclidean algorithm to find modular inverses, which is crucial for division operations in modular arithmetic. This algorithm:
//     - Extends the basic Euclidean algorithm for greatest common divisor (GCD) by also calculating the coefficients (x and y) such that ax + by = gcd(a, b).
//     - These coefficients help in deriving the modular inverse, particularly the coefficient associated with 'a' when 'b' is a modulus.
//     - This inverse is essential for solving equations of the form (a * x) % m = 1, where 'a' is the number and 'm' is the modulus.
//     - The algorithm efficiently computes the inverse even for large numbers, ensuring that the operations within the combinatorial calculations are feasible and efficient.