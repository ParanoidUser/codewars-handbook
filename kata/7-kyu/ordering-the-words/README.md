# [Ordering the words!](https://www.codewars.com/kata/ordering-the-words "https://www.codewars.com/kata/55d7e5aa7b619a86ed000070")

Given a string, you need to write a method that order every letter in this string in ascending order.

Also, you should validate that the given string is not empty or null. If so, the method should return: 

```
"Invalid String!";
```

## Examples

```
new Ordering().orderWord("hello world") => " dehllloorw"
new Ordering().orderWord("bobby") => "bbboy"
new Ordering().orderWord("") => "Invalid String!"
```

## Notes

- the given string can be lowercase and uppercase.<br />
- the string could include spaces or other special characters like '# ! or ,'