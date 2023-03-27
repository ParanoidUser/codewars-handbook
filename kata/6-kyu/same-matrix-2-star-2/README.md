# [Same matrix (2 * 2)](https://www.codewars.com/kata/same-matrix-2-star-2 "https://www.codewars.com/kata/635fc0497dadea0030cb7936")

You have some 2*2 matrices, each matrix is represented by an array of length 4.

such as [a, b, c, d] is matrix

```
a b
c d
```

Matrix can be rotated:

```
a b   90 degrees  c a  180 degrees  d c  270 degrees  b d
c d  -----------> d b  -----------> b a  -----------> a c
```

If matrix A can be obtained by rotating matrix B clockwise by 0, 90, 180 or 270 degrees, we think
that A and B are the same matrix.

For example, the following matrices are considered the same.

```
1 2
3 4

3 1
4 2

4 3
2 1

2 4
1 3
```

The task of this kata is to count how many matrices you have.

**Samples**

```
// Same as the above example.
count_different_matrices([[1, 2, 3, 4],
                          [3, 1, 4, 2],
                          [4, 3, 2, 1],
                          [2, 4, 1, 3]]);
                          
//should return '1'
```

**Notes**

All the values of the elements in the matrix are between 1 and 9, and the number of matrices will
not exceed 1000.