# [C is for Codewars](https://www.codewars.com/kata/c-is-for-codewars "https://www.codewars.com/kata/675dc1d3830826975c58a09d")

#### Task:

Build a string representing a capital letter C of a given size out of 'C' characters.

#### Examples: 

<code>generate_C(1)</code> should return this string:

<code>CCCCC<br></code>
<code>C<br></code>
<code>C<br></code>
<code>C<br></code>
<code>CCCCC<br></code>

<code>generate_C(2)</code> should be

<code>CCCCCCCCCC<br></code>
<code>CCCCCCCCCC<br></code>
<code>CC<br></code>
<code>CC<br></code>
<code>CC<br></code>
<code>CC<br></code>
<code>CC<br></code>
<code>CC<br></code>
<code>CCCCCCCCCC<br></code>
<code>CCCCCCCCCC<br></code>

and so on. The string returned by <code>generate_C(size)</code> should have <code>5*size</code> lines, following the format above. <code>size</code> is a positive integer <code>&le; 2000.</code>

Note that extra spaces after the C's in any line are incorrect. And the last line should not terminate with "
".

This kata was inspired by [A for Apple](https://www.codewars.com/kata/55de3f83e92c3e521a00002a), but takes a different approach to generating letters.
