# [Bulls and Cows](https://www.codewars.com/kata/bulls-and-cows "https://www.codewars.com/kata/5be1a950d2055d589500005b")

In this kata you will try to recreate a simple code-breaking game. It is called "Bulls and Cows". The rules are quite simple:

The computer generates a secret number consisting of 4 distinct digits. Then the player, in 8 turns, tries to guess the number. As a result he receives from the computer the number of matches. If the matching digits are in their right positions, they are "bulls", if in different positions, they are "cows". 

To implement this you will use:

1) a constructor (int) - initiates the game, receives a number and then sets it as the secret number.

2) and a function "compare with (int)" - compares the given and the secret numbers and then returns a String formatted as "X bull/bulls and Y cow/cows". 

However, there are some notes:

1) if the given number matches the secret number instead of returning "4 bulls and 0 cows", return "You win!". Any next attempts to play the game (even with invalid numbers) should return "You already won!"

2) if the amount of turns in this game is more than 8 (invalid turns are not counted) the returned String should be "Sorry, you're out of turns!".

3) After checking the turns you should validate the given number. If it does not correspond to the conditions you should throw an exception :
```  
IllegalArgumentException 
```
E.g.:
```
Game starts with the secret number 9041

compare with : 8091
result : "2 bulls and 1 cow" //The bulls are "0" and "1", the cow is "9"

compare with : -15555
result : Exception //A number should be positive and contain 4 distinct digits. 
                   //This turn is not counted
                   
compare with : 8237
result : "0 bulls and 0 cows"

compare with : 9041
result : "You win!"

//new comparations (even with invalid numbers) will result in : "You already won!"
//the same logic applies to being out of turns
```