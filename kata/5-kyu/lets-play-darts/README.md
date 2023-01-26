# [Let's Play Darts!](https://www.codewars.com/kata/lets-play-darts "https://www.codewars.com/kata/5870db16056584eab0000006")

Create your own mechanical dartboard that gives back your score based on the coordinates of your
dart.

## Task

Use the [scoring rules](https://en.wikipedia.org/wiki/Darts#Scoring) for a standard dartboard:
![](https://upload.wikimedia.org/wikipedia/commons/4/42/Dartboard.svg)

Finish method:

```
public String getScore(double x, double y);
```

The coordinates are `(x, y)` are always relative to the center of the board (0, 0). The unit is
millimeters. If you throw your dart 5 centimeters to the left and 3 centimeters below, it is written
as:

```
String score = dartboard.getScore(-50, -30);
```

Possible scores are:

- Outside the board: `"X"`
- Bull's eye: `"DB"`
- Bull: `"SB"`
- A single number, example: `"10"`
- A triple number: `"T10"`
- A double number: `"D10"`

A throw that ends exactly on the border of two sections results in a bounce out. You can ignore this
because all the given coordinates of the tests are within the sections.

The diameters of the circles on the dartboard are:

- Bull's eye: `12.70 mm`
- Bull: `31.8 mm`
- Triple ring inner circle: `198 mm`
- Triple ring outer circle: `214 mm`
- Double ring inner circle: `324 mm`
- Double ring outer circle: `340 mm`