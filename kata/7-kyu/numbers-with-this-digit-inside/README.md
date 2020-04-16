# [Numbers with this digit inside](https://www.codewars.com/kata/numbers-with-this-digit-inside "https://www.codewars.com/kata/57ad85bb7cb1f3ae7c000039")

You have to search all numbers from inclusive 1 to inclusive a given number x, that have the given digit d in it.<br>
The value of d will always be 0 - 9.<br>
The value of x will always be greater than 0.

You have to return as an array:
 - the count of these numbers,
 - their sum
 - and their product.

For example:

```
x = 11
d = 1
->
Numbers: 1, 10, 11
Return: [3, 22, 110]
```

If there are no numbers, which include the digit, return [0,0,0].