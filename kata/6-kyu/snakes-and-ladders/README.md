# [Snakes & Ladders](https://www.codewars.com/kata/snakes-and-ladders "https://www.codewars.com/kata/5821cd4770ca285b1f0001d5")

This Kata is like the game of <span style="font-weight:bold;color:red">Snakes & Ladders</span>

There is an array representing the squares on the game board.

The `starting` square is at array element 0. The `final` square is the last array element.

At each "turn" you move forward a number of places (according to the next dice throw).

The value at the square you end up on determines what happens next:

* ```0``` Stay where you are (until next turn)
* ```+n``` This is a "ladder". Go forward n places
* ```-n``` This is a "snake". Go back n places

Each snake or ladder will always end on a square with a 0, so you will only go up or down one at a time.

There are no ladders on the `starting` square, and there are no snakes on the `final` square.

## Rules

* You are given a number of dice throws. The game continues until either:

- You have no throws left, OR
- You end up exactly on the final square


* At each turn, make your move, then go up the "ladders" and down the "snakes" as appropriate.


* If the dice roll overshoots the final square then you cannot move. Roll the dice again.

## Task

Return the index of the array element that you ended up on at the end of the game.

## Example

Start
<pre>
Dice: [2, 1, 5, 1, 5, 4]
Board: [<span style="color:red">0</span>, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0]
</pre>
<hr>

Roll a ```2```. Move forward 2 squares, then go up the ladder (+3)
<pre>
Dice: [<span style="color:yellow">2</span>, 1, 5, 1, 5, 4]
Board: [0, 0, <span style="color:red">3</span>, 0, 0, 0, 0, -2, 0, 0, 0]              
Board: [0, 0, 3, 0, 0, <span style="color:red">0</span>, 0, -2, 0, 0, 0]              
</pre>
<hr>

Roll a ```1```. Move forward 1 square
<pre>
Dice: [2, <span style="color:yellow">1</span>, 5, 1, 5, 4]
Board: [0, 0, 3, 0, 0, 0, <span style="color:red">0</span>, -2, 0, 0, 0]              
</pre>
<hr>

Roll a ```5```. Can't move
<pre>
Dice: [2, 1, <span style="color:yellow">5</span>, 1, 5, 4]
Board: [0, 0, 3, 0, 0, 0, <span style="color:red">0</span>, -2, 0, 0, 0]              
</pre>
<hr>

Roll a ```1```. Move forward 1 square, then go down the snake (-2)
<pre>
Dice: [2, 1, 5, <span style="color:yellow">1</span>, 5, 4]
Board: [0, 0, 3, 0, 0, 0, 0, <span style="color:red">-2</span>, 0, 0, 0]              
Board: [0, 0, 3, 0, 0, <span style="color:red">0</span>, 0, -2, 0, 0, 0]              
</pre>
<hr>

Roll a ```5```. Move forward 5 squares
<pre>
Dice: [2, 1, 5, 1, <span style="color:yellow">5</span>, 4]            
Board: [0, 0, 3, 0, 0, 0, 0, -2, 0, 0, <span style="color:red">0</span>]              
</pre>
<hr>

You are on the final square so the game ends. Return ```10```