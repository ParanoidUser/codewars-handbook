# [Get the 𝑟𝑒𝑎𝑙 length of a string](https://www.codewars.com/kata/get-the-length-of-a-string "https://www.codewars.com/kata/599c4b69eb8e49effa000079")

In languages that use [UTF-16 encoding](https://en.wikipedia.org/wiki/UTF-16) for strings (JavaScript, JVM languages like Java, .NET
languages like C#...), if the code point of a character is larger than `0xFFFF`, it will be treated as two code units.

For example:

The code point of the emoji `🙉` (`U+1F649`, *Hear-No-Evil Monkey*) is `0x1F649`.

```java
"🙉".length(); // 2
```

Write a function that returns the *real* length of a string.

```
"abcd" --> 4
"🙉" --> 1
"😸🦌🚀" --> 3
```