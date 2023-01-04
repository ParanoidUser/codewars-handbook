# [More Zeros than Ones](https://www.codewars.com/kata/more-zeros-than-ones "https://www.codewars.com/kata/5d41e16d8bad42002208fe1a")

Create a __moreZeros__ function which will __receive a string__ for input, and __return an array__ (
or null terminated string in C) containing only the characters from that string whose __binary
representation of its ASCII value__ consists of _more zeros than ones_.

You should __remove any duplicate characters__, keeping the __first occurrence__ of any such
duplicates, so they are in the __same order__ in the final array as they first appeared in the input
string.

Examples

```
"abcde" ==  {0b1100001, 0b1100010, 0b1100011, 0b1100100, 0b1100101}
               True       True       False      True       False
                   
         --> "abd"
    
"DIGEST" --> "DIET"
```

All input will be valid strings of length > 0. Leading zeros in binary should not be counted.
