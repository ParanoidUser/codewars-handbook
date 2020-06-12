# [Chocolate problem](https://www.codewars.com/kata/chocolate-problem "https://www.codewars.com/kata/559a9a9ed391015e0700010f")

Chocolate factory produces unusual chocolate. Chocolate bars come in the form of **_long tiles 1 × N_**, which consists of N squares. Each square shows the portrait of one of the famous N confectioners of this company. Different chocolates have the same N confectioners' portraits, but in a different order.

## Task
Write a method, that for a given order of portraits of two chocolate bars determines a minimum number of breaks, that you need to perform on a first bar to form a second bar by repositioning the broken parts.

## Restriction 
- you can break a bar only on the boundaries of its squares.
- you can’t flip initial bar, or it's parts.

## Input data
- N - integer number (2 ≤ N ≤ 1000000), specifies the size of a chocolate bar, i.e. the number of squares in it. All bakers are numbered from 1 to N.
- firstBar, secondBar - integer arrays of N different numbers each (all the numbers don't exceed N) - portraits' order in the first and second bars respectively. It is known that these orders are different.


Your task is to calculate a single number - the minimum number of breaks that you need to perform on a first bar, to form a second bar by repositioning the broken parts.

Example:
```
int N = 5;
int firstBar[]  = {4, 3, 2, 5, 1};
int secondBar[] = {1, 2, 5, 3, 4};
chocolate(N, firstBar, secondBar);   // => returns 3
```