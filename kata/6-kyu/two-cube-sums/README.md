# [Two cube sums](https://www.codewars.com/kata/two-cube-sums "https://www.codewars.com/kata/55fd4919ce2a1d7c0d0000f3")

Create a function

```
boolean hasTwoCubeSums(int n)
```

which checks if a given number `n` can be written as the sum of two cubes in two different ways: `n = a³+b³ = c³+d³`.
All the numbers `a`, `b`, `c` and `d` should be different and greater than `0`.

E.g. 1729 = 9³+10³ = 1³+12³.

```
hasTwoCubeSums(1729); // true
hasTwoCubeSums(42);   // false
```