# [Strongest even number in an interval](https://www.codewars.com/kata/strongest-even-number-in-an-interval "https://www.codewars.com/kata/5d16af632cf48200254a6244")

A strongness of an even number is the number of times we can successively divide by 2 until we reach an odd number starting with an even number n.

For example, if n = 12, then
* 12 / 2 = 6
* 6 / 2 = 3

So we divided successively 2 times and we reached 3, so the strongness of 12 is `2`.

If n = 16 then
* 16 / 2 = 8
* 8 / 2 = 4
* 4 / 2 = 2
* 2 / 2 = 1

we divided successively 4 times and we reached 1, so the strongness of 16 is `4`

## Task

Given a closed interval `[n, m]`, return the even number that is the strongest in the interval. If multiple solutions exist return the smallest strongest even number.

Note that programs must run within the allotted server time; a naive solution will probably time out.

## Constraints

```
1 <= n < m <= INT_MAX
```

## Examples

```
[1, 2]    -->   2  # 1 has strongness 0, 2 has strongness 1
[5, 10]   -->   8  # 5, 7, 9 have strongness 0; 6, 10 have strongness 1; 8 has strongness 3
[48, 56]  -->  48
