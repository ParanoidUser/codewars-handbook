# [Pascal's Triangle](https://www.codewars.com/kata/pascals-triangle "https://www.codewars.com/kata/5226eb40316b56c8d500030f")

In mathematics, Pascal's triangle is a triangular array of the binomial coefficients expressed with
formula

```math
(n / k) = n! / k!(n-k)!
```

where `n` denotes a row of the triangle, and `k` is a position of a term in the row.

![Pascal's Triangle](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

You can
read [Wikipedia article on Pascal's Triangle](https://en.wikipedia.org/wiki/Pascal's_triangle) for
more information.

### Task

Write a function that, given a depth `n`, returns `n` top rows of Pascal's Triangle flattened into a
one-dimensional list/array.

### Example:

```
n = 1: [1]
n = 2: [1,  1, 1]
n = 4: [1,  1, 1,  1, 2, 1,  1, 3, 3, 1]
```

```
### Note

Beware of overflow. Requested terms of a triangle are guaranteed to fit into the returned type, but depending on seleced method of calculations, intermediate values can be larger.
```