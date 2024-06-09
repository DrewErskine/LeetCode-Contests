# LeetCode Competition Solutions

## Overview

LeetCode Weekly Contest 401 - 6/8/2024

## Problems

1. **Problem 1:** [Problem Title](#problem-1-title)
2. **Problem 2:** [Problem Title](#problem-2-title)
3. **Problem 3:** [Problem Title](#problem-3-title)

### Problem 1: 1. __Find the Child Who Has the Ball After K Seconds__ 

*You are given two positive integers n and k. There are n children numbered from 0 to n - 1 standing in a queue in order from left to right.

Initially, child 0 holds a ball and the direction of passing the ball is towards the right direction. After each second, the child holding the ball passes it to the child next to them. Once the ball reaches either end of the line, i.e. child 0 or child n - 1, the direction of passing is reversed.*

Return the number of the child who receives the ball after k seconds.

Example 1:
```
Input: n = 3, k = 5

Output: 1

Explanation:

Time elapsed    Children
0              [0, 1, 2]
1              [0, 1, 2]
2              [0, 1, 2]
3              [0, 1, 2]
4              [0, 1, 2]
5              [0, 1, 2]
```


Example 2:
```
Input: n = 5, k = 6

Output: 2

Explanation:

Time elapsed    Children
0            [0, 1, 2, 3, 4]
1            [0, 1, 2, 3, 4]
2            [0, 1, 2, 3, 4]
3            [0, 1, 2, 3, 4]
4            [0, 1, 2, 3, 4]
5            [0, 1, 2, 3, 4]
6            [0, 1, 2, 3, 4]```
```

Example 3:
```
Input: n = 4, k = 2

Output: 2

Explanation:

Time elapsed    Children
0             [0, 1, 2, 3]
1             [0, 1, 2, 3]
2             [0, 1, 2, 3]
```

```
Constraints:

2 <= n <= 50
1 <= k <= 50
```

#### Solution
@TODO code review - github.com/dmerskine19/LeetCode-Contest/Contest-1/Solution1

---

### Problem 2: __Find the N-th Value After K Seconds __

*You are given two integers n and k.

Initially, you start with an array a of n integers where a[i] = 1 for all 0 <= i <= n - 1. After each second, you simultaneously update each element to be the sum of all its preceding elements plus the element itself. For example, after one second, a[0] remains the same, a[1] becomes a[0] + a[1], a[2] becomes a[0] + a[1] + a[2], and so on.*

Return the value of a[n - 1] after k seconds.

Since the answer may be very large, return it modulo 109 + 7.

Example 1:
```
Input: n = 4, k = 5

Output: 56

Explanation:

Second     State After
0          [1,1,1,1]
1          [1,2,3,4]
2          [1,3,6,10]
3          [1,4,10,20]
4          [1,5,15,35]
5          [1,6,21,56]
```

Example 2:
```
Input: n = 5, k = 3

Output: 35

Explanation:

Second     State After
0          [1,1,1,1,1]
1          [1,2,3,4,5]
2          [1,3,6,10,15]
3          [1,4,10,20,35]
```

Constraints:
```
1 <= n, k <= 1000
```

#### Solution
@TODO code review - github.com/dmerskine19/LeetCode-Contest/Contest-1/Solution2

---

### Problem 3: __Maximum Total Reward Using Operations I__

*You are given an integer array rewardValues of length n, representing the values of rewards.
Initially, your total reward x is 0, and all indices are unmarked. You are allowed to perform the following operation any number of times:
Choose an unmarked index i from the range [0, n - 1].
If rewardValues[i] is greater than your current total reward x, then add rewardValues[i] to x (i.e., x = x + rewardValues[i]), and mark the index i.
*

Return an integer denoting the maximum total reward you can collect by performing the operations optimally.


Example 1:
```
Input: rewardValues = [1,1,3,3]
Output: 4
Explanation:
During the operations, we can choose to mark the indices 0 and 2 in order, and the total reward will be 4, which is the maximum.
```

Example 2:
```
Input: rewardValues = [1,6,4,3,2]
Output: 11
Explanation:
Mark the indices 0, 2, and 1 in order. The total reward will then be 11, which is the maximum.
```

Constraints:
```
1 <= rewardValues.length <= 2000
1 <= rewardValues[i] <= 2000
```

#### Solution
@TODO code review - github.com/dmerskine19/LeetCode-Contest/Contest-1/Solution3
