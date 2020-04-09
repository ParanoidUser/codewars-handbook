# [Time Conversion](https://www.codewars.com/kata/time-conversion "https://www.codewars.com/kata/5804d54135763659cc000146")

Given a time in <a href="https://en.wikipedia.org/wiki/12-hour_clock">12-hour AM/PM format</a>, convert it to military (24-hour) time.

<b>Note:</b> Midnight is 12:00:00AM  on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

<b>Input Format</b>

A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01 <= hh <= 12 and 00 <= mm,ss <= 59.

<b>Output Format</b>

Convert and print the given time in 24-hour format, where 00 <= hh <= 23.

<b>Sample Input</b>

<code class="lang-java">07:05:45PM</code> 

<b>Sample Output</b>

<code class="lang-java">19:05:45</code> 