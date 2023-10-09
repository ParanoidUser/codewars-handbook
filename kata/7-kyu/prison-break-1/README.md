# [Prison Break](https://www.codewars.com/kata/prison-break-1 "https://www.codewars.com/kata/6507e3170b7009117e0c7865")

A prison can be represented as an array of cells, where each cell contains exactly one prisoner. A 'True' represents an
unlocked cell, and 'False' represents a locked cell.

```
[True, True, False, False, False, True, False]
```

Starting inside the leftmost cell, you are tasked with determining how many prisoners you can set free, with a catch.
You are the prisoner in the first cell. If the first cell is locked (denoted as 'False'), you cannot free anyone. Each
time you free a prisoner, the locked cells become unlocked, and the unlocked cells become locked again.

So, if we use the example above:

```
[True, True, False, False, False, True, False]
// You free the prisoner in the 1st cell.

[False, False, True, True, True, False, True] 
// You free the prisoner in the 3rd cell (the 2nd one is locked).

[True, True, False, False, False, True, False]
// You free the prisoner in the 6th cell (the 3rd, 4th, and 5th cells are locked).

[False, False, True, True, True, False, True]
// You free the prisoner in the 7th cell - and you are done!
```

Here, we have set free '4' prisoners in total.

Create a function that, given this unique prison arrangement, returns the number of freed prisoners.

### Examples

```
([True, True, False, False, False, True, False]) ➞ 4

([True, True, True]) ➞ 1

([False, False, False]) ➞ 0

([False, True, True, True]) ➞ 0
```

### Notes

- **You are the prisoner in the first cell. You must be freed to free anyone else.**
- You must free a prisoner to change the locks. So in the second example where the input is `[True, True, True]`, after
  you release the first prisoner, the locks change to `[False, False, False]`. Since all cells are locked, you can
  release no more prisoners.
- You always start with the leftmost element in the array (the first prison cell). If all the prison cells to your right
  are 'False', you cannot free any more prisoners.