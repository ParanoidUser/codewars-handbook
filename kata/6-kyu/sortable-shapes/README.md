# [Sortable Shapes](https://www.codewars.com/kata/sortable-shapes "https://www.codewars.com/kata/586669a8442e3fc307000048")

Although shapes can be very different by nature, they can be sorted by the size of their area.

## Task:

Create different shapes that can be part of a sortable list. The sort order is based on the size of
their respective areas:

- The area of a <i><b style="color:lightgreen">Square</b></i> is the square of its <i><b>
  side</b></i>
- The area of a <i><b style="color:lightgreen">Rectangle</b></i> is <i><b>width</b></i> multiplied
  by <i><b>height</b></i>
- The area of a <i><b style="color:lightgreen">Triangle</b></i> is <i><b>base</b></i> multiplied
  by <i><b>height</b></i> divided by 2
- The area of a <i><b style="color:lightgreen">Circle</b></i> is the square of its <i><b>
  radius</b></i> multiplied by π
- The <i><b>area</b></i> of a <i><b style="color:lightgreen">CustomShape</b></i> is given

The default sort order of a list of shapes is ascending on area size:

```
double side = 1.1234;
double radius = 1.1234;
double base = 5;
double height = 2;

ArrayList<Shape> shapes = new ArrayList<Shape>();
shapes.add(new Square(side));
shapes.add(new Circle(radius));
shapes.add(new Triangle(base, height));

Collections.sort(shapes);

```

Use the correct π constant for your circle area calculations:

```

Math.PI

```