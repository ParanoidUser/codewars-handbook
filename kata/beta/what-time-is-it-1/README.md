# [What time is it?](https://www.codewars.com/kata/what-time-is-it-1 "https://www.codewars.com/kata/596218bb6878a33ca20000aa")

How many times have we been asked this simple question in our daily lives by family, friends and strangers alike? 

In this kata you take a look at your watch and answer this question in proper English. Sometimes you have your watch in 24h format and others in 12h. The AM/PM part of the time is always disregarded as the asker knows whether it's morning or afternoon.

## Requirements:

 - Mind the punctuation for the full hours *o'clock* is written as one word.
 - Spacing between individual words is strictly limited to one space. Cardinal numbers greater than 20 are hyphenated (e.g. "twenty-one").
 - Input is always going to be a non-null string in the format `\d{2}:\d{2}(\s?[ap]m)?`
 - Both 12h and 24h input may be present. In case of 12h input disregard the am/pm part.
 - Remember that in 24h midnight is denoted as 00:00.
 - There may or may not be a space between the minutes and the am/pm part in 12h format.

## Examples:

```
toHumanTime("05:28 pm"); // twenty-eight minutes past five
toHumanTime("12:00");    // twelve o'clock
toHumanTime("03:45am");  // quarter to four
toHumanTime("07:15");    // quarter past seven
toHumanTime("23:30");    // half past eleven
toHumanTime("00:01");    // one minute past twelve
toHumanTime("17:51");    // nine minutes to six
```