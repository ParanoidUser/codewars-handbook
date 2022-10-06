# [CubeSummation](https://www.codewars.com/kata/cubesummation "https://www.codewars.com/kata/550e9fd127c656709400024d")

Write a function `cubeSum(n, m)` that will calculate a sum of cubes of numbers in a given range,
starting from the smaller (but not including it) to the larger (including). The first argument is
not necessarily the larger number.

If both numbers are the same, then the range is empty and the result should be 0.

Examples:

```
cubeSum(2,3); // => 3^3 = 27
cubeSum(3,2); // => 3^3 = 27
cubeSum(0,4); // => 1^3+2^3+3^3+4^3 = 100
cubeSum(17, 14); // => 15^3+16^3+17^3 = 12384
cubeSum(9, 9); // => 0
```