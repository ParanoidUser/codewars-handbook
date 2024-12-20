# [Treasure Hunt with Clues](https://www.codewars.com/kata/treasure-hunt-with-clues "https://www.codewars.com/kata/66c0fec80a2a28b2a451d408")

Inputs:

A <code>n × n</code> grid with <code>1 &le; n &le; 9,</code> and 2 integers <code>row,col</code> with <code>1 &le; row,col &le; n,</code> indicating the starting position of the treasure hunt. 

Clues:

Every cell of the grid contains a number between <code>11</code> and <code>n<sup>2</sup>.</code> These values provide the coordinates of the next cell to search. The treasure is found in a cell whose value matches its location. (The clue says "stay where you are"!) There will always be treasure reachable from the starting position.

Output: 

The value in the treasure cell reached by following the clues from the starting position.

Example:

Consider the grid below, with starting position <code>row=3,col=4.</code> 
<code> 
34 21 32 44 25 
21 41 43 14 31 
31 45 52 42 23 
33 15 51 44 35 
21 52 33 13 44 
</code>

Indexes start from 1, so the value in cell <code>3,4</code> is <code>42.</code> Thus the next clue is found in cell <code>4,2.</code> The value there is <code>15.</code> Seeking in cell <code>1,5</code> uncovers the clue <code>25,</code> and cell <code>2,5</code> contains <code>31.</code> Since the value in cell <code>3,1</code> is <code>31,</code> that is the location of the treasure. 

Source: This kata extends a problem found on [GitHub](https://github.com/HoanVanHuynh/Programming-Practice-Problems--treasure-hunts).

Other Treasure-Hunt Kata: 

[Bob's Treasure Map](https://www.codewars.com/kata/5c3d3b73c48b71654d5eb15c)

[Treasure Map](https://www.codewars.com/kata/57d63b45ec1670518c000259)

[Pirate treasure chest codes](https://www.codewars.com/kata/595fb7d8de9d34743f000162)

[Treasure hunt](https://www.codewars.com/kata/556032250449c422d200004a)
