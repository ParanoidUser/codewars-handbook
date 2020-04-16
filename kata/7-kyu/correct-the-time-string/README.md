# [Correct the time-string](https://www.codewars.com/kata/correct-the-time-string "https://www.codewars.com/kata/57873ab5e55533a2890000c7")

A new task for you!

You have to create a method, that corrects a given time string.
There was a problem in addition, so many of the time strings are broken.
Time-Format is european. So from "00:00:00" to "23:59:59".
<br>
<br>
Some examples:

"09:10:01" -> "09:10:01"<br>
"11:70:10" -> "12:10:10"<br>
"19:99:99" -> "20:40:39"<br>
"24:01:01" -> "00:01:01"<br>

If the input-string is null or empty return exactly this value! (empty string for C++)<br/>
If the time-string-format is invalid, return null. (empty string for C++)