# [Length of missing array](https://www.codewars.com/kata/length-of-missing-array "https://www.codewars.com/kata/57b6f5aadb5b3d0ae3000611")

You get an array of arrays.<br>
If you sort the arrays by their length, you will see, that their length-values are consecutive.<br>
But one array is missing!<br>
<br><br>
You have to write a method, that return the length of the missing array.<br>
```
Example:
[[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]] --> 3
```
<br>

If the array of arrays is null/nil or empty, the method should return 0.<br>

When an array in the array is null or empty, the method should return 0 too!<br>
There will always be a missing element and its length will be always between the given arrays.