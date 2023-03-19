# [Finding queens on the board](https://www.codewars.com/kata/finding-queens-on-the-board "https://www.codewars.com/kata/64060d8ab2dd990058b7f8ee")

Your task is to find the maximum number of queens that can be put on the board so that there would
be one single unbeaten square (i.e. threatened by no queen on the board).

The Queen can move any distance vertically, horizontally and diagonally.

## Input

The queens(n) function takes the size of the chessboard.

`$n\in\Z$`, so it can be negative, and values can go up to `$141^{1000}$`.

## Output

* The maximum number of queens to leave one single unbeaten square
* Return `0` if `n` is negative.

## Examples

* `$n=4 \rightarrow 6\ queens $`
* `$n=5 \rightarrow 12\ queens $`