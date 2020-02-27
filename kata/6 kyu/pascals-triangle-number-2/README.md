# [Pascal's Triangle #2](https://www.codewars.com/kata/pascals-triangle-number-2 "https://www.codewars.com/kata/52945ce49bb38560fe0001d9")

Here you will create the classic [Pascal's triangle](https://en.wikipedia.org/wiki/Pascal%27s_triangle).
Your function will be passed the depth of the triangle and you code has to return the corresponding pascal triangle up to that depth.

The triangle should be returned as a nested array.

for example:
```
PascalsTriangle.pascal(5); // should return [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
```

To build the triangle, start with a single 1 at the top, for each number in the next row you just take the two numbers above it and add them together (except for the edges, which are all `1`), e.g.:
```
              [1]
            [1   1]
          [1   2   1]
        [1   3   3   1]
```