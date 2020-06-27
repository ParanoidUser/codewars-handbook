# [GCD sum](https://www.codewars.com/kata/gcd-sum "https://www.codewars.com/kata/5dd259444228280032b1ed2a")

Given the sum and gcd of two numbers, return those two numbers in ascending order. If the numbers do not exist, return `-1`, (or `NULL` in C, `tuple (-1,-1)` in C#, `pair (-1,-1)` in C++, `array {-1,-1} ` in Java).

```
For example: 
Given sum = 12 and gcd = 4...

solve(12,4) = [4,8]. The two numbers 4 and 8 sum to 12 and have a gcd of 4.

solve(12,5) = -1. No two numbers exist that sum to 12 and have gcd of 5.

solve(10,2) = [2,8]. Note that [4,6] is also a possibility but we pick the one with the lower first element: 2 < 4, so we take [2,8].
```

More examples in test cases. 