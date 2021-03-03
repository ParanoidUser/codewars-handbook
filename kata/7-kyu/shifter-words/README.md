# [Shifter words](https://www.codewars.com/kata/shifter-words "https://www.codewars.com/kata/603b2bb1c7646d000f900083")

You probably know that some characters written on a piece of paper, after turning this sheet 180 degrees, can be read, although sometimes in a different way. So, uppercase letters "H", "I", "N", "O", "S", "X", "Z" after rotation are not changed, the letter "M" becomes a "W", and Vice versa, the letter "W" becomes an "M".

We will call a word "shifter" if it consists only of these letters. After turning the sheet, this word can also be read, although in a different way. So, the word "WOW "turns into the word "MOM". On the other hand, the word "HOME" is not a shifter.

Find the number of **unique** shifter words in the input string (without duplicates). String contains only uppercase letters.

## Examples

```
Shifter.count("SOS IN THE HOME") == 2 // shifter words are "SOS" and "IN"
Shifter.count("WHO IS SHIFTER AND WHO IS NO") == 3 // shifter words are "WHO", "IS", "NO"
Shifter.count("TASK") == 0 // no shifter words
Shifter.count("") == 0 // no shifter words in empty string
```
