# [Decimal Time Conversion](https://www.codewars.com/kata/decimal-time-conversion "https://www.codewars.com/kata/6397b0d461067e0030d1315e")

<b>Write two functions, one that converts standard time to decimal time and one that converts
decimal time to standard time.</b>

<ul><li><code>toIndustrial(time)</code> should accept either the time in minutes as an integer or a string of the format "h:mm" or "hhh:mm". Minutes will always consist of two digits in the tests (e.g., "0:05"); hours can have more. Tests are simple in this regard: Expect rather small values (900 is the maximum).
Return a double that represents decimal hours (e.g. 1.75 for 1h 45m). Round to a precision of two decimal digits - do not simply truncate!
</li>
<li><code>toNormal(time)</code> should accept a double representing decimal time in hours.
Return a string that represents standard time in the format "h:mm".</li>
<li>Working time is usually rounded to Integer decimal minutes. Thus one normal minute equals 0.02 decimal hours, while two normal minutes equal 0.03 decimal hours and so on.</li>
<li>There will be no seconds in the tests. We'll neglect them for the purpose of this kata.</li>
</ul>

<h1>Examples:</h1>
<code>toIndustrial(61) => 1.02</code><br/>
<code>toIndustrial("1:45") => 1.75</code><br/>
<code>toNormal(0.33) => "0:20"</code><br/>
```