# [Fusion Chamber Shutdown](https://www.codewars.com/kata/fusion-chamber-shutdown "https://www.codewars.com/kata/5fde1ea66ba4060008ea5bd9")

A laboratory is testing how atoms react in ionic state during nuclear fusion. They introduce
different elements with Hydrogen in high temperature and pressurized chamber. Due to unknown reason
the chamber lost its power and the elements in it started precipitating</br>
Given the number of atoms of Carbon [C],Hydrogen[H] and Oxygen[O] in the chamber. Calculate how many
molecules of Water [H<sub>2</sub>O], Carbon Dioxide [CO<sub>2</sub>] and Methane [CH<sub>4</sub>]
will be produced following the order of reaction affinity below</br>

<pre>
<code>1. Hydrogen reacts with Oxygen   = H<sub>2</sub>O
2. Carbon   reacts with Oxygen   = CO<sub>2</sub>
3. Carbon   reacts with Hydrogen = CH<sub>4</sub>
</code></pre>

![](https://i.imgur.com/wDYZ9zg.jpg)
<b>FOR EXAMPLE:</b><br/>
(C,H,O) = (45,11,100)<br/>
return no. of water, carbon dioxide and methane molecules<br/>
<u>Output should be like:</u><br/>
(5,45,0)<br/>