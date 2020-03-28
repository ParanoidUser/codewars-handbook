# [Find something in an Array](https://www.codewars.com/kata/find-something-in-an-array "https://www.codewars.com/kata/53d56645ed770fb7c500085f")

Create a find function that takes a string and an array as arguments. If the string is in the array, return true.

For example:
```
NeedleInHaystack.find("hello", new String[]{"bye bye", "hello"})  // return true
// the haystack (searchable array) will never be null, but could contain null values;
NeedleInHaystack.find("be", new String[]{"careful", null, "oops"})  // return false
// also the needle could be null too
NeedleInHaystack.find(null, new String[]{"watch", "for", null})  // return true
```
Note: 
"Hello" !== "hello" // case-sensitive comparison