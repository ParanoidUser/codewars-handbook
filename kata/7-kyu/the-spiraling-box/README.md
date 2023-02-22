# [The 'spiraling' box](https://www.codewars.com/kata/the-spiraling-box "https://www.codewars.com/kata/63b84f54693cb10065687ae5")

## Task

Given two positive integers <code>m (width)</code> and <code>n (height)</code>, fill a
two-dimensional list (or array) of size <code>m-by-n</code> in the following way:

- (1) All the elements in the first and last row and column are 1.

- (2) All the elements in the second and second-last row and column are 2, excluding the elements
  from step 1.

- (3) All the elements in the third and third-last row and column are 3, excluding the elements from
  the previous steps.

- And so on ...

## Examples

<code>create_box(5, 8)</code> should return

```
[[1, 1, 1, 1, 1],
 [1, 2, 2, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 3, 2, 1], 
 [1, 2, 3, 2, 1],
 [1, 2, 2, 2, 1],
 [1, 1, 1, 1, 1]]
```

<code>create_box(10, 9)</code> should return

```
[[1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
 [1, 2, 2, 2, 2, 2, 2, 2, 2, 1],
 [1, 2, 3, 3, 3, 3, 3, 3, 2, 1], 
 [1, 2, 3, 4, 4, 4, 4, 3, 2, 1], 
 [1, 2, 3, 4, 5, 5, 4, 3, 2, 1], 
 [1, 2, 3, 4, 4, 4, 4, 3, 2, 1], 
 [1, 2, 3, 3, 3, 3, 3, 3, 2, 1], 
 [1, 2, 2, 2, 2, 2, 2, 2, 2, 1], 
 [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]]
```