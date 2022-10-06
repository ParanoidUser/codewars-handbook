# [[UIB] Count the number of 'a' in a text that ends with '.'](https://www.codewars.com/kata/uib-count-the-number-of-a-in-a-text-that-ends-with-dot "https://www.codewars.com/kata/5c471f3da4db1e7a3dddc9e9")

Write a program that reads the standard input and counts the number of times the character `'a'` appears in the text, that ends with `'.'`.

Notify the solution via standard output, following the given template.

Remember that you can read a character from the standard input with the following method:

```
(char) System.in.read();
```

Examples:

* `"codewars."` -> `1`
* `"there is nothing like home."` -> `0`
* `"hello how are you i am fine what about you."` -> `4`
* `"."` -> `0`
* `"three rings for the elven kings under the sky, seven for the dwarf lords in their halls of stone, nine for the mortal men doomed to die, one for the dark lord on his dark throne, in the land of mordor where the shadows lie one ring to rule them all, one ring to find them, one ring the bring them all, and in the darkness bind them in the land of mordor where the shadows lie."` -> `13`