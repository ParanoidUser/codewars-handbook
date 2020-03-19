# [Regex Tic Tac Toe Win Checker](https://www.codewars.com/kata/regex-tic-tac-toe-win-checker "https://www.codewars.com/kata/582e0450fe38013dbc0002d3")

Your function will receive a string of nine "X", "O", and/or "-" characters representing the state of a tic tac toe board, for example the string 
```
"X-OXXXO-O"
```
would represent the board
```
X-O
XXX
O-O
```
where player X has won by getting three in a row horizontally on the middle row.

Your function needs to return True/true/TRUE (depending on the language you're using) if either the X or the O player has won the game by getting three in a row vertically, horizontally, or diagonally; or False/false/FALSE if there is no winner.

A few more examples:

`"---------"` - False - no one has even made a move yet!

`"XOOOXXXXO"` - False - no one got three in a row here.

`"OXO-XOX-O"` - True - player O won by getting three in a row vertically in the third column.

Note: Occasionally one of the random boards in the Test Suite will have two three-in-a-rows instead of one or none, and this still counts as a winning board. If the two three-in-a-rows belong to the same player, this just means that the second player played so badly that the first player's fifth and final move created two three-in-a-rows. If the two three-in-a-rows belong to different players, this just means that although one player won the game, afterward (as sometimes happens in real life) the other player made their mark in another square anyway, just because even though they already lost, they feel better doing that. :-)