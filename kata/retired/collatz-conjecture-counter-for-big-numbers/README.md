# [Collatz conjecture counter for big numbers](https://www.codewars.com/kata/collatz-conjecture-counter-for-big-numbers "https://www.codewars.com/kata/610eac59e3ed8c00075fcc9d")

The _Collatz conjecture_ also known as `3*x+1` problem is defined as follows:

Given a number `n > 0`:

* If `n` is even, divide it by two.
* If `n` is odd, triple it and add one.

Continue with these steps until this series will (hopefully 😉) hold with `1`.

## Example with `n = 3`:

```
3   → odd   → 3*3+1
10  → even  → 10/2
5   → odd   → 3*5+1
16  → even  → 16/2
8   → even  → 8/2
4   → even  → 4/2
2   → even  → 2/2
(1) → hold and count → 7 Numbers!
```

## Goal

Please return the count of all visited numbers until your algorithm holds with `1`. Be aware to not
count the last step to the number `1`.

Referring to the above example, the correct solution is `7`.