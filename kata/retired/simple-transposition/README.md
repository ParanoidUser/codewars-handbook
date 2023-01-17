# [Simple transposition](https://www.codewars.com/kata/simple-transposition "https://www.codewars.com/kata/57a153e872292d7c030009d4")

Simple transposition is a basic and simple cryptography technique. We make 2 rows and put first a
letter in the Row 1, the second in the Row 2, third in Row 1 and so on until the end. Then we put
the text from Row 2 next to the Row 1 text and thats it.

Complete the function that receives a string and encrypt it with this simple transposition.

## Example

For example if the text to encrypt is: `"Simple text"`, the 2 rows will be:

<table >
	<tr>
		<th>Row 1</th>
		<td>S</td>
		<td>m</td>
		<td>l</td>
		<td> </td>
		<td>e</td>
		<td>t</td>
	</tr>
	<tr>
		<th>Row 2</th>
		<td>i</td>
		<td>p</td>
		<td>e</td>
		<td>t</td>
		<td>x</td>
		<td> </td>
	</tr>
</table>

<br>
So the result string will be: `"Sml etipetx"`
