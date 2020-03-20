# [Split Strings](https://www.codewars.com/kata/split-strings "https://www.codewars.com/kata/515de9ae9dcfc28eb6000001")

Complete the solution so that it splits the string into pairs of two characters.  If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

```
StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
```