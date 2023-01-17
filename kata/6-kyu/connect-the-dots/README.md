# [Connect the Dots](https://www.codewars.com/kata/connect-the-dots "https://www.codewars.com/kata/5d6a11ab2a1ef8001dd1e817")

Connect the dots in order to make a picture!

## Notes

* There are 2-26 dots labelled  `a` `b` `c` ...
* The line char is `*`
* Use only straight lines - vertical, horizontal, or diagonals of a square
* The paper is rectangular - `\n` terminates every line
* All input is valid

## Examples

<table style='width:50%'>
<tr><th style='width:50%'>Input</th><th>Expected</th></tr>
<tr><td>
<pre style='background:black;font-size:20px;line-height:20px;font-family:monospace;'>&nbsp;
&nbsp;a&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b 
&nbsp;e         
&nbsp;           
&nbsp;d&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;c 
&nbsp;
</pre>
</td>
<td>
<pre style='background:black;font-size:20px;line-height:20px;font-family:monospace;'>&nbsp;         
&nbsp;*********
&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*
&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*
&nbsp;*********
&nbsp;
</pre></td></tr>
</table>

<table style='width:50%;'>
<tr><th style='width:50%'>Input</th><th>Expected</th></tr>
<tr><td>
<pre style='background:black;font-size:20px;line-height:20px;font-family:monospace;'>&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;a
&nbsp;&nbsp;&nbsp;e
&nbsp;&nbsp;    
&nbsp;d&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b
&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;      
&nbsp;&nbsp;&nbsp;&nbsp;c
&nbsp;
</pre></td><td>
<pre style='background:black;font-size:20px;line-height:20px;font-family:monospace;'>&nbsp;    
&nbsp;&nbsp;&nbsp;&nbsp;*
&nbsp;&nbsp;&nbsp;*&nbsp;*
&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;*
&nbsp;*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*
&nbsp;&nbsp;*&nbsp;&nbsp;&nbsp;*
&nbsp;&nbsp;&nbsp;*&nbsp;*
&nbsp;&nbsp;&nbsp;&nbsp;*
&nbsp;
</pre></td></tr>
</table>          