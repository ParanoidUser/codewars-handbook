# [String interlacing](https://www.codewars.com/kata/string-interlacing "https://www.codewars.com/kata/56e120ee2bb224eaa3000ba2")

Given two strings with any value of any length return the resulting string of alternating characters from one and the other.

Example with strings of the same size: given the strings "Hello" and "World" then the result string is "HWeolrllod".
In this case the first character in the result must be the first character of the first function parameter.

With Strings of different sizes repeat the mixing till the end of the larger string repeating characters of the smaller one.
Example: given the strings "Drinking" and "beer" the result is "Dbreienrkbienegr".
With strings of different sizes the result must start with the first character of the larger one.

The result must always end with a character of the other string value than the one used to start the result value.

White spaces do not have to be taken into account even when calculating string sizes ("abcd" is larger than "a b c")
Example: with strings "Biking" and "the city" the result should be "tBhiekciintgyB"