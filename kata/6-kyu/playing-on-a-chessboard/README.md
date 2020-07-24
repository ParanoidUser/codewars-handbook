# [Playing on a chessboard](https://www.codewars.com/kata/playing-on-a-chessboard "https://www.codewars.com/kata/55ab4f980f2d576c070000f4")

With a friend we used to play the following game on a chessboard
(8, rows, 8 columns).
On the first row at the *bottom* we put numbers:

`1/2, 2/3, 3/4, 4/5, 5/6, 6/7, 7/8, 8/9`

On row 2 (2nd row from the bottom) we have:

`1/3, 2/4, 3/5, 4/6, 5/7, 6/8, 7/9, 8/10`

On row 3:

`1/4, 2/5, 3/6, 4/7, 5/8, 6/9, 7/10, 8/11`

until last row:

`1/9, 2/10, 3/11, 4/12, 5/13, 6/14, 7/15, 8/16`


When all numbers are on the chessboard each in turn we toss a coin. The one who get "head" wins and
the other gives him, in dollars, the **sum of the numbers on the chessboard**.
We play for fun, the dollars come from a monopoly game! 

### Task
How much can I (or my friend) win or loses for each game if the chessboard has n rows and n columns? Add all of the fractional values on an n by n sized board and give the answer as a simplified fraction.
  
- Ruby, Python, JS, Coffee, Clojure, PHP, Elixir, Crystal, Typescript, Go:

The function called 'game' with parameter n (integer >= 0) returns as result an irreducible fraction written as an array of integers: [numerator, denominator].
If the denominator is 1 return [numerator].

- Haskell:

'game' returns either a "Left Integer" if denominator is 1 otherwise 
"Right (Integer, Integer)" 

- Prolog:
'game' returns an irreducible fraction written as an array of integers: [numerator, denominator].
If the denominator is 1 return [numerator, 1].

- Java, C#, C++, F#, Swift, Reason, Kotlin:

'game' returns a string that mimicks the array returned in Ruby, Python, JS, etc...

- Fortran, Bash: 'game' returns a string


- Forth: return on the stack the numerator and the denominator (even if the denominator is 1)


- In Fortran - as in any other language - the returned string is not permitted
to contain any redundant trailing whitespace: you can use dynamically allocated character strings.