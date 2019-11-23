# [Delta Bits](https://www.codewars.com/kata/delta-bits "https://www.codewars.com/kata/538948d4daea7dc4d200023f")

Complete the function to determine the number of bits required to convert integer `A` to integer `B` (where `A` and `B` >= 0)

The upper limit for `A` and `B` is 2<sup>16</sup>, `int.MaxValue` or similar.

For example, you can change 31 to 14 by flipping the 4th and 0th bit:
```
 31  0 0 0 1 1 1 1 1
 14  0 0 0 0 1 1 1 0
---  ---------------
bit  7 6 5 4 3 2 1 0
```
Thus `31` and `14` should return `2`.
