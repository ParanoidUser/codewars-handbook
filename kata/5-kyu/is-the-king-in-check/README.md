# [Is the King in check ?](https://www.codewars.com/kata/is-the-king-in-check "https://www.codewars.com/kata/5e28ae347036fa001a504bbe")

You have to write a function that takes for input a 8x8 chessboard in the form of a bi-dimensional
array of chars (or strings of length 1, depending on the language) and returns a boolean indicating
whether the king is in check.

The array will include 64 squares which can contain the following characters :

```
<ul>
  <li>'K' for the black King;</li>
  <li>'Q' for a white Queen;</li>
  <li>'B' for a white Bishop;</li>
  <li>'N' for a white kNight;</li>
  <li>'R' for a white Rook;</li>
  <li>'P' for a white Pawn;</li>
  <li>' ' (a space) if there is no piece on that square.</li>
</ul>
```

There will always be exactly one king, which is the **black** king, whereas all the other pieces are
**white**.<br>
**The board is oriented from Black's perspective.**<br>
Remember that pawns can only move and take **forward**.<br>
Also be careful with the pieces' lines of sight ;-) .

The input will always be valid, no need to validate it.
To help you visualize the position, tests will print a chessboard to show you the problematic cases.
Looking like this :

<pre>
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | ♜ |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | ♔ |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
</pre>
