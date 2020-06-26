# [LOTTO 6 aus 49 - 6 of 49](https://www.codewars.com/kata/lotto-6-aus-49-6-of-49 "https://www.codewars.com/kata/57a98e8172292d977b000079")

In Germany we have "LOTTO 6 aus 49". That means that 6 of 49 numbers are drawn as winning combination.  
There is also a "Superzahl", an additional number, which can increase your winning category.

In this kata you have to write two methods.

```
public static int[] numberGenerator()

public static int checkForWinningCategory(int[] checkCombination, int[] winningCombination)
```

The first method is for drawing the lottery numbers.  
You have to create an array with 7 random numbers. 6 from these are from 1 - 49.  
Of course every number may only occur once.  
And the 7th number is the "Superzahl". A number from 0 - 9. This number is independent from the first six numbers.  
The first 6 numbers have to be in ascending order.

A result could be:<br>
4, 9, 17, 22, 25, 35, 0<br>
Or:<br>
4, 18, 22, 34, 41, 44, 4

The second method should check a given number against the winning combination and have to return the winning category:

```
1  - 6 numbers and Superzahl match
2  - 6 numbers match
3  - 5 numbers and Superzahl match
4  - 5 numbers match
5  - 4 numbers and Superzahl match
6  - 4 numbers match
7  - 3 numbers and Superzahl match
8  - 3 numbers match
9  - 2 numbers and Superzahl match
-1 - if the numbers do not match any of the rules above
```