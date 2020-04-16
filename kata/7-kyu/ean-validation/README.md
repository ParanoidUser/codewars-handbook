# [EAN Validation](https://www.codewars.com/kata/ean-validation "https://www.codewars.com/kata/55563df50dda59adf900004d")

A lot of goods have an <a href="https://en.wikipedia.org/wiki/International_Article_Number_%28EAN%29"> International Article Number</a> (formerly known as "European Article Number") abbreviated "EAN". EAN is a 13-digits barcode consisting of 12-digits data followed by a single-digit checksum (EAN-8 is not considered in this kata).

The single-digit checksum is calculated as followed (based upon the 12-digit data):

The digit at the first, third, fifth, etc. position (i.e. at the odd position) has to be multiplied with "1". 
<br>The digit at the second, fourth, sixth, etc. position (i.e. at the even position) has to be multiplied with "3".<br>
Sum these results. <br>

If this sum is dividable by 10, the checksum is 0. Otherwise the checksum has the following formula:

  checksum = 10 - (sum mod 10)

For example, calculate the checksum for "400330101839" (= 12-digits data):<br>

4\*1 + 0\*3 + 0\*1 + 3\*3 + 3\*1 + 0\*3 + 1\*1 + 0\*3 + 1\*1 + 8\*3 + 3\*1 + 9\*3<br>
= 4 + 0 + 0 + 9 + 3 + 0 + 1 + 0 + 1 + 24 + 3 + 27 <br>
= 72<br>
10 - (72 mod 10) = 8 ? Checksum: 8<br>

Thus, the EAN-Code is 400330101839<b>8</b> (= 12-digits data followed by single-digit checksum).
 
<h2>Your Task</h2>
Validate a given EAN-Code. Return true if the given EAN-Code is valid, otherwise false.

<h2>Assumption</h2>
You can assume the given code is syntactically valid, i.e. it only consists of numbers and it exactly has a length of 13 characters.

<h2>Examples</h2>

```
EANValidator.validate("4003301018398") // true
EANValidator.validate("4003301018392") // false
```