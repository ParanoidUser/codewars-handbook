# [Nut Farm](https://www.codewars.com/kata/nut-farm "https://www.codewars.com/kata/59884371d1d8d3d9270000a5")

It's a pretty relaxing life here at the nut farm.

Most of the time we just sit around looking at our nuts.

But once a year comes harvesting time...

Harvesting nuts is very easy. We just shake the trees and the nuts fall out!

---

As they fall down the nuts might hit branches:
* Sometimes they bounce left.
* Sometimes they bounce right.
* Sometimes they get stuck in the tree and don't fall out at all.

## Legend

* ```o``` = a nut
* ```\``` = branch. A nut hitting this branch bounces right
* ```/``` = branch. A nut hitting this branch bounces left
* ```_``` = branch. A nut hitting this branch gets stuck in the tree
* ```.``` = leaves, which have no effect on falling nuts
* ```|``` = tree trunk, which has no effect on falling nuts
* ``` ``` = empty space, which has no effect on falling nuts

## Task

Shake the tree and count where the nuts land.

**Output** - An array (same width as the tree) which indicates how many nuts fell at each position ^

^ See the example tests

## Notes

* The nuts are always found at the top of the tree
* Nuts do not affect the falling patterns of other nuts
* There are always enough spaces for nuts to fall between branches
* There are no branches at the extreme left/right edges of the tree matrix so it is not possible for a nut to fall "out of bounds"

## Example

<pre style='font-size:20px;line-height:22px;'>
<span style='background:green'>.</span>o<span style='background:green'>.</span>oooooo<span style='background:green'>.</span>o<span style='background:green'>.</span>o<span style='background:green'>.</span>oooooo<span style='background:green'>.</span>
<span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>
<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>
<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>/<span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span>\<span style='background:green'>.</span>
<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>/<span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>
<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span>/<span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>
<span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>
<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>
<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>\<span style='background:green'>.</span>_<span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>_<span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>\<span style='background:green'>.</span>
<span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>\<span style='background:green'>.</span><span style='background:green'>.</span>
<span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span>/<span style='background:green'>.</span><span style='background:green'>.</span>
         <span style='background:brown'> </span><span style='background:brown'> </span><span style='background:brown'> </span>
         <span style='background:brown'> </span><span style='background:brown'> </span><span style='background:brown'> </span>
         <span style='background:brown'> </span><span style='background:brown'> </span><span style='background:brown'> </span>
         <span style='background:brown'> </span><span style='background:brown'> </span><span style='background:brown'> </span>
         <span style='background:brown'> </span><span style='background:brown'> </span><span style='background:brown'> </span>
         <span style='background:brown'> </span><span style='background:brown'> </span><span style='background:brown'> </span>
101005000020000000040
</pre>