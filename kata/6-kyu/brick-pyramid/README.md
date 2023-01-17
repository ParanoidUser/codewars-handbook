# [Brick pyramid](https://www.codewars.com/kata/brick-pyramid "https://www.codewars.com/kata/5836f1bb44ff28b068000ba4")

"Pyramid" is infinite.<br>
"Pyramid" is two-dimensional (triangle).<br>

(row, pos) - function parameters.<br>
row - top row number ranging from zero,<br>
pos - brick number from left to right ranging from zero.

Brick weight - 1 kg.

Every brick equally presses the bricks underneath.<br>
1/2 to the left brick and 1/2 to the right.

If the brick pressed above with the total mass of 100 kg than the pressure is distributed evenly on
the bottom bricks.

Required: implement function weight that calculates the pressure on the brick on the row, pos
position.

Testing values:

```
weight(0, 0) => 0

weight(1, 0) => 0.5
weight(1, 1) => 0.5

weight(2, 0) => 0.75
weight(2, 1) => 1.5
weight(2, 2) => 0.75

weight(3, 0) => 0.875
weight(3, 1) => 2.125
weight(3, 2) => 2.125
weight(3, 3) => 0.875
```