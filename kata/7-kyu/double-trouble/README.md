# [Double Trouble](https://www.codewars.com/kata/double-trouble "https://www.codewars.com/kata/57f7796697d62fc93d0001b8")

Given an array of integers (x), and a target (t), you must find out if any two consecutive numbers
in the array sum to t. If so, remove the second number.

Example:

x = [1, 2, 3, 4, 5]  
t = 3  

1+2 = t, so remove 2. No other pairs = t, so rest of array remains:

[1, 3, 4, 5]

Work through the array from left to right.

Return the resulting array.