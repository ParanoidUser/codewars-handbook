# [Sum of Digits / Digital Root](https://www.codewars.com/kata/sum-of-digits-slash-digital-root "https://www.codewars.com/kata/541c8630095125aba6000c00")

In this kata, you must create a `digital root` function.

A digital root is the _recursive sum of all the digits in a number._ Given _n_, take the sum of the digits of _n_. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

Here's how it works:
```
digitalRoot(16)
=> 1 + 6
=> 7

digitalRoot(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6

digitalRoot(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4
=> 6

digitalRoot(493193)
=> 4 + 9 + 3 + 1 + 9 + 3
=> 29 ...
=> 2 + 9
=> 11 ...
=> 1 + 1
=> 2
```