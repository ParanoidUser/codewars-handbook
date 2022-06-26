# [Scramblies](https://www.codewars.com/kata/scramblies "https://www.codewars.com/kata/55c04b4cc56a697bb0000048")

Complete the function `scramble(str1, str2)` that returns `true` if a portion of ```str1```
characters can be rearranged to match ```str2```, otherwise returns ```false```.

## Notes:

* Only lower case letters will be used (a-z). No punctuation or digits will be included.
* Performance needs to be considered.

## Examples

```
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
```