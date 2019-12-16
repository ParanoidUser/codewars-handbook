# [String Merge!](https://www.codewars.com/kata/string-merge "https://www.codewars.com/kata/597bb84522bc93b71e00007e")

Given two words and a letter, return a single word that's a combination of both words, merged at the point where the given letter first appears in each word. The returned word should have the beginning of the first word and the ending of the second, with the dividing letter in the middle. You can assume both words will contain the dividing letter.

## Examples

```
stringMerge("hello", "world", "l")      ==>  "held"
stringMerge("coding", "anywhere", "n")  ==>  "codinywhere"
stringMerge("jason", "samson", "s")     ==>  "jasamson"
stringMerge("wonderful", "people", "e") ==>  "wondeople"
```