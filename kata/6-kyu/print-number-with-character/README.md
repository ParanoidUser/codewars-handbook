# [Print number with character](https://www.codewars.com/kata/print-number-with-character "https://www.codewars.com/kata/5bc5c0f8eba26e792400012a")

**Your task** is to implement function `printNumber` (`print_number` in C/C++ and Python `Kata.printNumber` in Java) that returns string that represents given number in text format (see examples below).

Arguments:
 - `number` — Number that we need to print (`num` in C/C++/Java)
 - `char` — Character for building number (`ch` in C/C++/Java)

## Examples

```
Kata.printNumber(99, '$')
//Should return
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n
//$                                      $\n
//$   $$$$   $$$$   $$$$   $$$$   $$$$   $\n
//$  $$  $$ $$  $$ $$  $$ $$  $$ $$  $$  $\n
//$  $$  $$ $$  $$ $$  $$ $$  $$ $$  $$  $\n
//$  $$  $$ $$  $$ $$  $$  $$$$   $$$$   $\n
//$  $$  $$ $$  $$ $$  $$   $$     $$    $\n
//$   $$$$   $$$$   $$$$   $$     $$     $\n
//$                                      $\n
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

Kata.printNumber(12345, '*')
//Should return
//****************************************\n
//*                                      *\n
//*    **    ****   ****  **  ** ******  *\n
//*   ***   **  ** **  ** **  ** **      *\n
//*  * **      **     **  **  ** *****   *\n
//*    **     **      **   *****     **  *\n
//*    **    **    **  **     **     **  *\n
//*  ****** ******  ****      ** *****   *\n
//*                                      *\n
//****************************************

Kata.printNumber(67890, '@')
//Should return
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n
//@                                      @\n
//@     @@  @@@@@@  @@@@   @@@@   @@@@   @\n
//@    @@   @@  @@ @@  @@ @@  @@ @@  @@  @\n
//@   @@@@     @@   @@@@  @@  @@ @@  @@  @\n
//@  @@  @@   @@    @@@@   @@@@  @@  @@  @\n
//@  @@  @@  @@    @@  @@   @@   @@  @@  @\n
//@   @@@@   @@     @@@@   @@     @@@@   @\n
//@                                      @\n
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
```

## Notes:

 - Number should be `0 <= number <= 99999` and have `5 digits` (should have zeros at the start if needed)
 - Test cases contains only valid values (integers that are 0 <= number <= 99999) and characters
 - Numbers should have the same shape as in the examples (6x6 by the way)
 - Returned string should be joined by `\n` character (except of the end)
 - Returned string should have 1 character *(height)* border (use the same character as for number) + padding (1 character in height vertical and 2 horizontal with ` `) around borders and 1 character margin between "digits"