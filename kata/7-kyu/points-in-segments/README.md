# [Points in Segments](https://www.codewars.com/kata/points-in-segments "https://www.codewars.com/kata/5baa25f3246d071df90002b7")

&ensp;You are given a set of `n` segments on the axis `Ox`, each segment has integer endpoints between `0` and `m` inclusive.<br>
&ensp;Segments may intersect, overlap or even coincide with each other. Each segment is characterized by two integers l<sub>i</sub> and r<sub>i</sub> — coordinates of the left and of the right endpoints.

&ensp;Consider all integer points between `0` and `m` inclusive. Your task is to print all such points that don't belong to any segment. The point x belongs to the segment `[l;r]` if and only if `l ≤ x ≤ r`.

**Input:**<br>
&ensp;`m` — the upper bound for coordinates;<br>
&ensp;array of coordinates l<sub>i</sub> and r<sub>i</sub> `0 ≤ li ≤ ri ≤ m` — the endpoints of the `i`-th segment. Segments may intersect, overlap or even coincide with each other.

**Output:**<br>
&ensp;All points from `0` to `m` that don't belong to any segment.

**Examples:**
```
(5, [[2,2],[1,2],[5,5]]) => [0,3,4]
(7, [[0,7]]) => []
```
