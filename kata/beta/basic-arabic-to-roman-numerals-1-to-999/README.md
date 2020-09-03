# [Basic Arabic-To-Roman Numerals (1 to 999)](https://www.codewars.com/kata/basic-arabic-to-roman-numerals-1-to-999 "https://www.codewars.com/kata/5580d8dc8e4ee9ffcb000050")

The magazine staff is asking us to help them with the issue numbers. Magazines are numbered using Roman Numerals.

We need to be able to convert [Arabic](https://en.wikipedia.org/wiki/Arabic_numerals) numerals to [Roman](https://en.wikipedia.org/wiki/Roman_numerals) ones.

Initially our API only needs to support numbers from 1 to 999.

The API must manage nonconvertible numbers by returning the ***Not a Roman*** constant string `"NaR"`.

## Examples:

Given
```
ArabicToRomanConverter converter = new ArabicToRomanConverter();
converter.toRoman(0); //"NaR"
converter.toRoman(-1); //"NaR"
converter.toRoman(1); //"I"
converter.toRoman(5); //"V"
converter.toRoman(599); //"DXCIX"
```