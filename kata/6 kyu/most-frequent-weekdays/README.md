# [Most Frequent Weekdays](https://www.codewars.com/kata/most-frequent-weekdays "https://www.codewars.com/kata/56eb16655250549e4b0013f4")

What is your favourite day of the week? Check if it's the most frequent day of the week in the year.

You are given a year as integer (e.g. 2001). You should return the most frequent day(s) of the week in that year. The result has to be a list of days sorted by the order of days in week (e. g. `['Monday', 'Tuesday']`). Week starts with Monday.

__Input:__ Year as an __int__.

__Output:__ The list of most frequent days sorted by the order of days in week (from Monday to Sunday).

__Preconditions:__ Year is between 1 and 9999. Week starts with Monday. Calendar is Gregorian.

__Example:__
```
Kata.mostFrequentDays(2427) => {"Friday"}
Kata.mostFrequentDays(2185) => {"Saturday"}
Kata.mostFrequentDays(2860) => {"Thursday", "Friday"}
```