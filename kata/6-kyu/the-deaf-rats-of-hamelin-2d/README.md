# [The Deaf Rats of Hamelin (2D)](https://www.codewars.com/kata/the-deaf-rats-of-hamelin-2d "https://www.codewars.com/kata/5c1448e08a2d87eda400005f")

Those pesky rats have returned and this time they have taken over the Town Square.

The <a href="https://en.wikipedia.org/wiki/Pied_Piper_of_Hamelin">Pied Piper</a> has been enlisted again to play his magical tune and coax all the rats towards him.

But some of the rats are deaf and are going the wrong way!

## Task

How many deaf rats are there?

## Input Notes

* The Town Square is a rectangle of square paving stones (the Square has 1-15 pavers per side)
* The Pied Piper is always present

## Output Notes

* Deaf rats are those that are moving to paving stone **further away** from the Piper than where they are now
* Use Euclidian distance for your calculations

## Legend

* `P` = The Pied Piper
* `←` `↑` `→` `↓` `↖` `↗` `↘` `↙` = Rats going in different directions
* space = Everything else



## Examples

ex1 - has 1 deaf rat

<pre style='background:black'>
↗ P	 	 
  <span style='color:red'>↘</span>   ↖
  ↑	 	 
↗ 	 
</pre>

---

ex2 - has 7 deaf rats

<pre style='background:black'>
    <span style='color:red'>↗</span>	 	 
P <span style='color:red'>↓</span>   ↖ <span style='color:red'>↑</span>
    ←   <span style='color:red'>↓</span>
  ↖ ↙   ↙
<span style='color:red'>↓ ↓ ↓</span>
</pre>