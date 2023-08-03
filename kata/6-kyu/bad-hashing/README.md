# [B.A.D. Hashing](https://www.codewars.com/kata/bad-hashing "https://www.codewars.com/kata/59678a814e686ba17b000079")

The company <span style="color:#FFCCCC">_Bad Work_</span> has created a hashing algorithm they swear is flawless. [citation missing] You as a developer are tasked to code it. You doubt the peer reviewing of the standard at first but your boss says you should not complain and just create it. He assures you it'll be okay. The **Bombastic Awesome Dominator Hash** can't fail. 

## Description

The hashing standard works as follows on a string:

* If the string is longer than 32 characters, remove characters from the end until it is. If it contains less than 32 characters, add the 'a' character until it is 32 characters.
* Convert every character to its ascii code
* Lexicographically sort the list by its value  descending (don't worry about stability)
* Add the index of the value to the ascii code.
  e.g. the first value, 0 is added, second value 1, and so on
* Take modulo 16 of each value
* Change each value into a hexadecimal value 0-F
* Return the string in uppercase

They assure you it is _so_ complex, not even they know how it works exactly. Someone did a proof on a whiteboard with some words like "quad erat demonstrantum" and "hypothenuse". They were very good at math in high school.

## Example

They show you the following example:

```
"a"
"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]
[97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97]
[97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128]
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0]
"123456789ABCDEF0123456789ABCDEF0"
```

## Task

Implement the 'hashing' algorithm. Bonus points if you prove how to crack the hash. Assume you always get a non-null string of arbitrary length.