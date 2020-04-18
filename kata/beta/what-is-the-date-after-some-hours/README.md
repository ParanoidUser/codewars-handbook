# [What is the date after some hours?](https://www.codewars.com/kata/what-is-the-date-after-some-hours "https://www.codewars.com/kata/59569fca8d5875762700000e")

What is the date after some hours?

The method takes a date as a string in this format "2017.12.30 22:15" and a number of hours after (or before) the date (with a minus sign if before).

The method returns the date as a string in this format "2017.12.31".

Examples:
```
assertEquals("2017.12.31", FindTheDate.getDate("2017.12.30 22:15", 10));
assertEquals("2018.01.12", FindTheDate.getDate("2017.12.30 22:15", 300));
assertEquals("2017.12.25", FindTheDate.getDate("2017.12.30 22:15", -125));
```