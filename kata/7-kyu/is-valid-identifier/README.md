# [Is valid identifier?](https://www.codewars.com/kata/is-valid-identifier "https://www.codewars.com/kata/563a8656d52a79f06c00001f")

Given a string, determine if it's a valid identifier.

## Here is the syntax for valid identifiers:

* Each identifier must have at least one character.
* The first character must be picked from: alpha, underscore, or dollar sign. The first character cannot be a digit.
* The rest of the characters (besides the first) can be from: alpha, digit, underscore, or dollar sign. In other words, it can be any valid identifier character.

## Examples of valid identifiers:

* i
* wo_rd
* b2h

## Examples of invalid identifiers:

* 1i
* wo rd 
* !b2h