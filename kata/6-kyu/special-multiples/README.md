# [Special Multiples](https://www.codewars.com/kata/special-multiples "https://www.codewars.com/kata/55e785dfcb59864f200000d9")

Some numbers have the property to be divisible by 2 and 3.
Other smaller subset of numbers have the property to be divisible by 2, 3 and 5.
Another subset with less abundant numbers may be divisible by 2, 3, 5 and 7.
These numbers have something in common: their prime factors are contiguous primes.

Create a function count_specMult() that finds the amount of numbers that have the first n primes as factors below a given value, maxVal

Let's see some cases:
```
count_specMult(3, 200) -------> 6 

/// the first 3 primes are 2, 3 and 5

and the found numbers below 200 are 30 < 60 < 90 < 120 < 150 < 180 < 200 (6 numbers)

```