# [Lunar Mathematics: Addition](https://www.codewars.com/kata/lunar-mathematics-addition "https://www.codewars.com/kata/5c4b5f06b1fd9b3fec8cb03e")

Lunar Mathematics, otherwise known as 'Dismal Mathematics' (a play on 'decimal mathematics'), was created as an alternate way to view mathematics interacts with numbers. Here, we will create the addition function.

On the moon, there is no need to carry over numbers into the next column. Instead, we take the largest value of each column, and set that as our total.

Examples:

        8
      + 7
      ----
        8 <- Since 8 is the larger number of the two, it is the one used.
        

      234
    + 180
    -----
      284 <- the larger values of each number are used for each potion.
      
      50
     +59
    ------
      59 <- If a number in two columns match, either one of the numbers can be used.
      
      465
     + 72
    -----
      475 <- You must handle situations where numbers are not of equal length

Assume all numbers given are valid, nonnegative integers (as there are no negative numbers on the moon). 