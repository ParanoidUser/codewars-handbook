# [Primary Primes](https://www.codewars.com/kata/primary-primes "https://www.codewars.com/kata/57572c0a6be575bd7c000264")

You have to find how many primes are in range from 2 to n that have one property: If you cut last digit, their rest digits will still make prime number.

Example: `2339 -> 233 -> 23 -> 2` all are primes.

```
PrimaryPrime.find(24) -> 5 // 2,3,5,7,23
```

Primes from 2 to 24: [2,3,5,7,11,13,17,19,23] 
The first 4 primes are of course Primary Primes.
The 4 primes, that's stars with 1 are NO Primary Primes, because 1 (first digit) is no prime. 
And 23 is a Primary Prime, because 2 (first digit) is a prime.