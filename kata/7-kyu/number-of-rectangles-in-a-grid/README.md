# [Number of Rectangles in a Grid](https://www.codewars.com/kata/number-of-rectangles-in-a-grid "https://www.codewars.com/kata/556cebcf7c58da564a000045")

Given a grid of size m x n, calculate the total number of rectangles contained in this rectangle. All integer sizes and positions are counted.

Examples:
```
numberOfRectangles(3, 2) == 18
numberOfRectangles(4, 4) == 100
```

Here is how the 3x2 grid works:

1 rectangle of size 3x2:
```
[][][]
[][][]
```

2 rectangles of size 3x1:
```
[][][]
```

4 rectangles of size 2x1:
```
[][]
```

2 rectangles of size 2x2
```
[][]
[][]
```

3 rectangles of size 1x2:
```
[]
[]
```

6 rectangles of size 1x1:
```
[]
```

As you can see (1 + 2 + 4 + 2 + 3 + 6) = 18, and is the solution for the 3x2 grid.

There is a very simple solution to this!