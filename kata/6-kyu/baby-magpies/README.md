# [Baby Magpies](https://www.codewars.com/kata/baby-magpies "https://www.codewars.com/kata/59bb02f5623654a0dc000119")

Magpies are my favourite birds

Baby ones even more so...

![](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Magpie_samcem05.jpg/220px-Magpie_samcem05.jpg)

It is a little known fact that the black & white colours of baby magpies differ by **at least** one
place and **at most** two places from the colours of the mother magpie.

So now you can work out if any two magpies may be related.

*...and Quardle oodle ardle wardle doodle the magpies said*

## Kata Task

Given the colours of two magpies, determine if one is a possible **child** or **grand-child** of the
other.

## Notes

* Each pair of birds being compared will have same number of colour areas
* `B` = Black
* `W` = White

## Example

Given these three magpies

<pre style='font-size:6em;line-height:90px;'>
<span style='font-size:20px;'>Magpie 1  </span><span style='background:black'>B</span><span style='background:white;color:black'>W</span><span style='background:black'>B</span><span style='background:white;color:black'>W</span><span style='background:black'>B</span><span style='background:white;color:black'>W</span>
<span style='font-size:20px;'>Magpie 2  </span><span style='background:black'>B</span><span style='background:white;color:black'>W</span><span style='background:black'>B</span><span style='background:white;color:black'>W</span><span style='background:black'>B</span><span style='background:black;color:brown'>B</span>
<span style='font-size:20px;'>Magpie 3  </span><span style='background:white;color:brown'>W</span><span style='background:white;color:black'>W</span><span style='background:white;color:brown'>W</span><span style='background:white;color:black'>W</span><span style='background:black'>B</span><span style='background:black'>B</span>
</pre>

You can see:

* Magpie 2 may be a child of Magpie 1 because there is only one difference
* Magpie 3 may be child of Magpie 2 because there are two differences
* So Magpie 3 may be a grand-child of Magpie 1
* On the other hand, Magpie 3 cannot be a child of Magpie 1 because there are three differences