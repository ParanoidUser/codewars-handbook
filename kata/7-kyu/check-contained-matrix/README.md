# [Check contained matrix](https://www.codewars.com/kata/check-contained-matrix "https://www.codewars.com/kata/5a46179ce626c5ef8d000024")

Implement a module that takes as an input two matrices of integer numbers. Both matrices are already filled with integer numbers. The first matrix has a size MxN (M>=3, N>=3) and the second one has a size of 3x3 (rows x columns).

The module must check if the second matrix is contained in the first matrix. If that check succeeds, it must store (not display) the coordinates of the first matrix where the second matrix starts (upper left corner). For example, given the two following matrices, the module will store (1, 1), row 1, column 1. If the second matrix is not contained in the first one, the module will store -1 -1. The module will store the coordinates of the first match it finds.

```
  MATRIX A       MATRIX B 
| 4 1 3 8 |     | 1 3 3 |      
| 2 1 3 3 |  ,  | 2 3 1 | -->  row = 1, column = 1
| 0 2 3 1 |     | 3 1 1 |
| 1 3 1 1 |
```