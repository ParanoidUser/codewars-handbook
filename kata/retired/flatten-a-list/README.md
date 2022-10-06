# [Flatten a List](https://www.codewars.com/kata/flatten-a-list "https://www.codewars.com/kata/57e12e24621bcaaac10000e3")

You get a list of Objects, those Objects can again be lists, sets or Integers.

Your Task is to write a function to flatten the nesting in the list.

Example:

```
Input:  [[1], 2, [[3, 4], 5], [[[]]], [[[6]]], 7, 8, []]

Output: [1, 2, 3, 4, 5, 6, 7, 8]
```

If the list is null or empty return an empty list.