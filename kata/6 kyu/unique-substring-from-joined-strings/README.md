# [Unique Substring From Joined Strings](https://www.codewars.com/kata/unique-substring-from-joined-strings "https://www.codewars.com/kata/5778aa7c82d7d0b49c00001a")

Write a function that takes two strings, <b>A</b> and <b>B</b>, and returns the length of the longest possible substring that can be formed from the concatenation of either <b>A + B</b> or <b>B + A</b> containing only characters that do not appear in both A and B.


<h2>Example:</h2>

Given the strings "piquancy" and "refocusing":<br>
A = "piquancy"<br>
B = "refocusing"<br>
A + B = "piquancyrefocusing"<br>
B + A = "refocusingpiquancy"<br>


Since 'i', 'n', 'u', and 'c' appear in both A and B, all acceptable substrings without those characters are:<br>
"p", "q", "a", "yrefo", "s", "g" (from A + B)<br>
"refo", "s", "gp", "q", "a", "y" (from B + A)<br>

Therefore, it would be correct to return 5: the length of "yrefo".