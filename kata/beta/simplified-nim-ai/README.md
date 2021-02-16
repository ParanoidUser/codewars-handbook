# [Simplified Nim - AI](https://www.codewars.com/kata/simplified-nim-ai "https://www.codewars.com/kata/6022bb1e7239e800220b4678")

In this simplified version of the game Nim, there are 12 coins. Each player can either remove 1 or 2 or 3 coins. Whoever picks up the last coin wins the game.

Your task is to write an AI that always wins (the player will always go first).

Write a class ``Game`` that contains the function ``turn`` :

``turn`` takes the player's (in this case the tests) move as input (has to be between 1 - 3) and returns the AI's (your program) move (if the player won, the AI returns 0)

``Exceptions``:
turn needs to throw an Exception when 
- the player input is below 1 
- the player input is above 3 
- the player inputs even tho the game is over