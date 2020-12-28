# [How Many Numbers?](https://www.codewars.com/kata/how-many-numbers "https://www.codewars.com/kata/55d8aa568dec9fb9e200004a")

Create a function ```sel_number()```, that will select numbers that fulfill the following constraints:

1) The numbers should have 2 digits at least.

2) They should have their respective digits in increasing order from left to right. 
Examples: 789, 479, 12678, have these feature. But 617, 89927 are not of this type.
In general, if ```d1, d2, d3....``` are the digits of a certain number ```i``` 
Example:
```( i = d1d2d3d4d5) so, d1 < d2 < d3 < d4 < d5```

3) They cannot have digits that occurs twice or more. Example: 8991 should be discarded.

4) The difference between neighbouring pairs of digits cannot exceed certain value. 
Example: If the difference between contiguous digits cannot exceed 2, so 1345, 23568 and 234578 pass this test. Other numbers like 1456, 389, 157 don't belong to that group because in the first number(1456), the difference between second and first digit 4 - 1 > 2; in the next one(389), we have 8 - 3 > 2; and see by yourself why 157 should be discarded.
In general, taking the example above of ```i = d1d2d3d4d5```:
```
d2 - d1 <= d;

d3 - d2 <= d;

d4 - d3 <= d;

d5 - d4 <= d;
```
The function should accept two arguments n and d; n is the upper limit of the range to work with(all the numbers should be less or equal than n), and d is maximum difference  between every pair of its contiguous digits. It's clear that 1 <= d <= 8.

Here we have some cases:
```
sel_number(0,1) = 0 # n = 0, empty range
sel_number(3, 1) = 0 # n = 3, numbers should be higher or equal than 12
sel_number(13, 1) = 1 # only 12 fulfill the requirements
sel_number(20, 2) = 2 # 12 and 13 are the numbers
sel_number(30, 2) = 4 # 12, 13, 23 and 24 are the selected ones
sel_number(44, 2) = 6 # 12, 13, 23, 24, 34 and 35 are valid ones
sel_number(50, 3) = 12 # 12, 13, 14, 23, 24, 25, 34, 35, 36, 45, 46 and 47 are valid
```
Compare the last example with this one:
```
sel_number(47, 3) = 12 # 12, 13, 14, 23, 24, 25, 34, 35, 36, 45, 46 and 47 are valid 
```
(because the instructions says the value of may be included if it fulfills the above constraints of course)