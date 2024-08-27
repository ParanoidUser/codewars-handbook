# [Days in the year](https://www.codewars.com/kata/days-in-the-year "https://www.codewars.com/kata/56d6c333c9ae3fc32800070f")

A variation of determining leap years, assuming only integers are used and years can be negative and positive.

Write a function which will return the days in the year and the year entered in a string. For example:

```
Input: year = 2000 ==> returns "2000 has 366 days"
```

There are a few assumptions we will accept the year 0, even though there is no year 0 in the Gregorian Calendar.

Also the basic rule for validating a leap year are as follows

Most years that can be divided evenly by 4 are leap years. 

Exception: Century years are NOT leap years UNLESS they can be evenly divided by 400.

So the years 0, -64 and 2016 will return 366 days.
Whilst 1974, -10 and 666 will return 365 days.
