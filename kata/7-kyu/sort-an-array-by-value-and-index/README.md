# [Sort an array by value and index](https://www.codewars.com/kata/sort-an-array-by-value-and-index "https://www.codewars.com/kata/58e0cb3634a3027180000040")

Your task is to sort an array of integer numbers by the product of the value and the index of the positions.
<br><br>
For sorting the index starts at 1, NOT at 0!<br>
The sorting has to be ascending.<br>
The array will never be null and will always contain numbers.
<br><br>
Example:

```
Input: 23, 2, 3, 4, 5
Product of value and index:
23 => 23 * 1 = 23  -> Output-Pos 4
 2 =>  2 * 2 = 4   -> Output-Pos 1
 3 =>  3 * 3 = 9   -> Output-Pos 2
 4 =>  4 * 4 = 16  -> Output-Pos 3
 5 =>  5 * 5 = 25  -> Output-Pos 5

Output: 2, 3, 4, 23, 5
```