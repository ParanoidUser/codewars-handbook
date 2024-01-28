# [Sudoku board validator](https://www.codewars.com/kata/sudoku-board-validator "https://www.codewars.com/kata/63d1bac72de941033dbf87ae")

### Sudoku Background

Sudoku is a game played on a 9x9 grid. The goal of the game is to fill all cells of the grid with
digits from 1 to 9, so that each column, each row, and each of the nine 3x3 sub-grids (also known as
blocks) contain all the digits from 1 to 9.  
More info at: https://en.wikipedia.org/wiki/Sudoku

### Sudoku Solution Validator

Write a function that accepts a Sudoku board, and returns true if it is a valid Sudoku solution, or
false otherwise. The cells of the input Sudoku board may also contain 0's, which will represent
empty cells. Boards containing one or more zeroes are considered to be invalid solutions.

### Examples

```
Valid board:

  5 3 4|6 7 8|9 1 2
  6 7 2|1 9 5|3 4 8
  1 9 8|3 4 2|5 6 7
  -----+-----+-----
  8 5 9|7 6 1|4 2 3
  4 2 6|8 5 3|7 9 1
  7 1 3|9 2 4|8 5 6
  -----+-----+-----
  9 6 1|5 3 7|2 8 4
  2 8 7|4 1 9|6 3 5
  3 4 5|2 8 6|1 7 9
```

```
Invalid board:
                
              This column has two 3's
                        v
This cell has a 0 > 0 3 4|6 7 8|9 1 2
                    6 7 2|1 9 5|3 4 8
                    1 9 8|3 4 2|5 6 7
                    -----+-----+-----
                    8 5 9|7 6 1|4 2 3
                    4 2 6|8 5 3|7 9 1
                    7 1 3|9 2 4|8 5 6
                    -----+-----+-----
    This box has   /9 6 1|5 3 7|2 8 4
         two 3's >| 2 8 3|4 1 9|6 3 5 < This row has two 3's
                   \3 4 5|2 8 6|1 7 9
```

### Details

- All inputs are guaranteed to be 2D boards of size 9x9 with possible values in range 0-9.
- Rows, columns and blocks (3x3 small squares) must contain each number from range 1-9 exactly once.
- User solution must not modify input boards.