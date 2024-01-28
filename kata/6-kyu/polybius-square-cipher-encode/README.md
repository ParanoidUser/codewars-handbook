# [Polybius square cipher - encode](https://www.codewars.com/kata/polybius-square-cipher-encode "https://www.codewars.com/kata/542a823c909c97da4500055e")

Implement the [Polybius square cipher](https://en.wikipedia.org/wiki/Polybius_square).

Replace every letter with a two-digit number. The first digit is the row number, and the second
digit is the column number of following square. Letters `'I'` and `'J'` are both 24 in this cipher:

<table id="polybius-square">
<tbody><tr><th></th><th>1</th><th>2</th><th>3</th><th>4</th><th>5</th></tr>
<tr><th>1</th><td>A</td><td>B</td><td>C</td><td>D</td><td>E</td></tr>
<tr><th>2</th><td>F</td><td>G</td><td>H</td><td>I/J</td><td>K</td></tr>
<tr><th>3</th><td>L</td><td>M</td><td>N</td><td>O</td><td>P</td></tr>
<tr><th>4</th><td>Q</td><td>R</td><td>S</td><td>T</td><td>U</td></tr>
<tr><th>5</th><td>V</td><td>W</td><td>X</td><td>Y</td><td>Z</td></tr>
</tbody></table>

Input will be valid (only spaces and uppercase letters from A to Z), so no need to validate them.

## Examples

```
Solution.polybius("A")  // "11"
Solution.polybius("IJ") // "2424"
Solution.polybius("CODEWARS") // "1334141552114243"
Solution.polybius("POLYBIUS SQUARE CIPHER") // "3534315412244543 434145114215 132435231542"
```