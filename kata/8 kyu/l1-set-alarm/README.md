# [L1: Set Alarm](https://www.codewars.com/kata/l1-set-alarm "https://www.codewars.com/kata/568dcc3c7f12767a62000038")

<p>Write a function named setAlarm which receives two parameters. The first parameter, <em>employed</em>, is true whenever you are employed and the second parameter, <em>vacation</em> is true whenever you are on vacation.</p>

<p>The function should return true if you are employed and not on vacation (because these are the circumstances under which you need to set an alarm). It should return false otherwise. Examples:</p>

```
setAlarm(true, true) -> false
setAlarm(false, true) -> false
setAlarm(false, false) -> false
setAlarm(true, false) -> true
```