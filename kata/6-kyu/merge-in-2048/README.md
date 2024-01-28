# [Merge in 2048](https://www.codewars.com/kata/merge-in-2048 "https://www.codewars.com/kata/55e1990978c60e5052000011")

Remember the game 2048? https://play2048.co

The main part of this game is merging identical tiles in a row. 

* Implement a function that models the process of merging all of the tile values in a single row.  
* This function takes the array line as a parameter and returns a new array with the tile values from line slid towards the front of the array (index 0) and merged.
* A given tile can only merge once.
* Empty grid squares are represented as zeros.
* Your function should work on arrays containing arbitrary number of elements.


## Examples

```
merge([2,0,2,2])  -->  [4,2,0,0]
```

Another example with repeated merges: 

```
merge([4,4,8,16])  -->  [8,8,16,0]
merge([8,8,16,0])  -->  [16,16,0,0]
merge([16,16,0,0]) -->  [32,0,0,0]
```