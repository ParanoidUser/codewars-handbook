# [Convert ISBN-10 to ISBN-13](https://www.codewars.com/kata/convert-isbn-10-to-isbn-13 "https://www.codewars.com/kata/61ce25e92ca4fb000f689fb0")

ISBN stands for International Standard Book Number.

For more than thirty years, ISBNs were 10 digits long. On January 1, 2007 the ISBN system switched
to a 13-digit format. Now all ISBNs are 13-digits long. Actually, there is not a huge difference
between them. You can convert a 10-digit ISBN to a 13-digit ISBN by adding the prefix number (978)
to the beginning and then recalculating the last, check digit using a fairly simple method.

### Method

1. Take the ISBN *("1-85326-158-0")*.
2. Remove the last character, which can be a number or "X".
3. Add the prefix number (978) and a hyphen (-) to the beginning.
4. Take the 12 digits, then alternately multiply each digit from left to right by 1 or 3.
5. Add up all 12 numbers you got.
6. Take the number and perform a modulo 10 division.
7. If the result is 0, the check digit is 0. If it isn't 0, then subtract the result from 10. In
   this case, that is the check digit.
8. Add the check digit to the end of the result from step 3.
9. Return the 13-digit ISBN in the appropriate format:  
   "`prefix number` - `original ISBN except the last character` - `check digit`"  
   "`978` - `1` - `85326` - `158` - `9`"

### Example

```
ISBN = "1-85326-158-0"
remove_last_character = "1-85326-158-"
add_prefix = "978-1-85326-158-"
twelve_digits = 978185326158

check_digit = 9*1 + 7*3 + 8*1 + 1*3 + 8*1 + 5*3 + 3*1 + 2*3 + 6*1 + 1*3 + 5*1 + 8*3
            =   9 +  21 +   8 +   3 +   8 +  15 +   3 +   6 +   6 +   3 +   5 +  24
            = 111
            111 % 10 = 1
            10 - 1 = 9

thirteen_digit = 9781853261589

return "978-1-85326-158-9"
```