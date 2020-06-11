# [Basic Encryption](https://www.codewars.com/kata/basic-encryption "https://www.codewars.com/kata/5862fb364f7ab46270000078")

The most basic encryption method is to map a char to another char by a certain math rule.
Because every char has an ASCII value, we can manipulate this value with a simple math expression. 
For example 'a' + 1 would give us 'b', because 'a' value is 97 and 'b' value is 98.

You will need to write a method which does exactly that - get a string as text and an int as the rule of manipulation, and should return encrypted text.

For example:
```
encrypt("a" ,1) = "b"
```

*Full ascii table is used on our question (256 chars) - so 0-255 are the valid values.*