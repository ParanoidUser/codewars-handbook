# [Calculate the area of a regular n sides polygon inside a circle of radius r](https://www.codewars.com/kata/calculate-the-area-of-a-regular-n-sides-polygon-inside-a-circle-of-radius-r "https://www.codewars.com/kata/5a58ca28e626c55ae000018a")

Write the following function:
```
public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) 
```

It should calculate the area of a regular polygon of `numberOfSides`, `number-of-sides`, or `number_of_sides` sides inside a circle of radius `circleRadius`, `circle-radius`, or `circle_radius` which passes through all the vertices of the polygon (such circle is called [**circumscribed circle** or **circumcircle**](https://en.wikipedia.org/wiki/Circumscribed_circle)). The answer should be a number rounded to 3 decimal places. 

Input :: Output Examples 
```
areaOfPolygonInsideCircle(3, 3) // returns 11.691

areaOfPolygonInsideCircle(5.8, 7) // returns 92.053

areaOfPolygonInsideCircle(4, 5) // returns 38.042
```