# [Power of two](https://www.codewars.com/kata/power-of-two "https://www.codewars.com/kata/534d0a229345375d520006a0")

Complete the function `power_of_two`/`powerOfTwo` (or equivalent, depending on your language) that
determines if a given non-negative integer is a [power of two](https://en.wikipedia.org/wiki/Power_of_two). 
From the corresponding Wikipedia entry:

> *a power of two is a number of the form 2<sup>n</sup> where **n** is an integer, i.e. the result
of exponentiation with number two as the base and integer **n** as the exponent.*

You may assume the input is always valid.

## Examples

```
PowerOfTwo.isPowerOfTwo(1024) // -> true
PowerOfTwo.isPowerOfTwo(4096) // -> true
PowerOfTwo.isPowerOfTwo(333)  // -> false
```

Beware of certain edge cases - for example, `1` is a power of `2` since `2^0 = 1` and `0` is not a
power of `2`.