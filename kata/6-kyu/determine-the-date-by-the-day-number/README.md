# [Determine the date by the day number](https://www.codewars.com/kata/determine-the-date-by-the-day-number "https://www.codewars.com/kata/602afedfd4a64d0008eb4e6e")

What date corresponds to the `n`<sup>th</sup> day of the year?  
The answer depends on whether the year is a leap year or not.

Write a function that will help you determine the date if you know the number of the day in the year, as well as whether the year is a leap year or not.  
The function accepts the day number and a boolean value `isLeap` as arguments, and returns the corresponding date of the year as a string `"Month, day"`.  
Only valid combinations of a day number and `isLeap` will be tested.

## Examples:

```
getDay(41, false)   =>  "February, 10"  //  41st day of non-leap year is February, 10
getDay(60, false)   =>  "March, 1"      //  60th day of non-leap year is March, 1
getDay(60, true)    =>  "February, 29"  //  60th day of leap year is February, 29
getDay(365, false)  =>  "December, 31"  //  365th day of non-leap year is December, 31
getDay(366, true)   =>  "December, 31"  //  366th day of leap year is December, 31
```