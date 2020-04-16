# [O's and X's adjudicator](https://www.codewars.com/kata/os-and-xs-adjudicator "https://www.codewars.com/kata/5a08f48fba2a1435e30000d7")

Write a method to determine the outcome of a game of O's and X's. https://en.wikipedia.org/wiki/Tic-tac-toe

The method ```public String judge(List<Integer> history)``` accepts a List of Integer objects representing the move history of both players in order as zero indexed offsets. The board squares are numbered with on offset as follows:
```
012
345
678
```
The X player makes the first move. 
The method should return a String,  either ```"X_WIN"```, ```"O_WIN"```, or ```"NO_WINNER"```, to indicate the outcome of the game.

Input is guaranteed to represent a valid Os and Xs game.