# [Check whether a number is valid in a given numeral system](https://www.codewars.com/kata/check-whether-a-number-is-valid-in-a-given-numeral-system "https://www.codewars.com/kata/67757660c552a3a7ef9aaceb")

A numeral system is a way of writing numbers using a specific set of digits: for example, the decimal system (also called base-10), which is
the most commonly used numeral system worldwide, uses the digits 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 to represent numbers. There is also the binary
system (also called base-2), which uses the digits 0 and 1.

For digits that are bigger than 9, the English alphabet is used: 'A' is used for the number 10 in bases higher than 10. This goes all the
way to 'Z' in base-36.

The largest digit allowed in a certain base is always 1 smaller than this base.

You need to write a function that checks whether all of the digits of a non-negative integer number are a part of the specified base: for
example, the number 17253 is valid for base-8, because this base contains the digits 0, 1, 2, 3, 4, 5, 6, 7, but the number 19823 is not
valid for this base, because it contains the digits 9 and 8 which are not a part of base-8.

Note: numbers will be checked against bases from 2 to 36. For digits > 9 (A, B, etc.) such digits will always be uppercase. The function
should return a boolean: ```true``` for numbers that are valid for a specified numeral system and ```false``` otherwise.