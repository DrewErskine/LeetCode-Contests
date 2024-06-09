class Solution {
    private static final int modulo = 1000000007;
    private static final int maxTime = 1000;
    private long[] factorial = new long[maxTime + 1];
    private long[] invFactorial = new long[maxTime + 1];

    public Solution() {
        factorial[0] = 1;
        for (int i = 1; i <= maxTime; i++) {
            factorial[i] = factorial[i - 1] * i % modulo;
        }

        for (int i = 0; i <= maxTime; i++) {
            invFactorial[i] = euclideanInverse(factorial[i], modulo);
        }
    }

    public int valueAfterKSeconds(int n, int k) {
        return (int) combine(k + n - 1, n - 1);
    }

    private long combine(int n, int k) {
        if (k > n - k) k = n - k;
        long numerator = factorial[n];
        long denominator = factorial[k] * factorial[n - k] % modulo;
        return numerator * euclideanInverse(denominator, modulo) % modulo;
    }

    private long euclideanInverse(long a, long m) {
        // Extended euclidean algorithm ;-;
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
