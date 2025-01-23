# [The Circle Class](https://www.codewars.com/kata/the-circle-class "https://www.codewars.com/kata/6787fe7f9c97c27a6d055d9a")

The Circle Class
------------------

The Circle class has two fields: ```radius```, a double that represents the radius of the circle, and ```origin```, a Point object that represents the coordinates of the center of the circle.

Your job is to implement the three methods of the circle class. The first of which of course being the constructor, which takes the double ```radius``` and the Point ```origin``` as arguments. The last two methods are both named ```.pointFromAngle()``` and both return a Point object that represents a point on the circumference of the circle when given an angle.

The difference between the two ```.pointFromAngle()``` methods is that one takes the int ```degrees``` for its angle and the other takes the double ```radians```.

Preloaded for you is the Point class.
```
public class Point{
 public double x,y;
 public Point(double x, double y){
 this.x = x;
 this.y = y;
 }
}
```
For testing purposes, Point also includes .toString() and .equals(), the latter of which accepting a small margin of error to account for the inexactness of doubles.

Finding a Point Using an Angle
------------------

Remember that on a radius 1 circle, the x value of a point is the cosine of its angle and the y value of the point is the sine of its angle. Do not forget to consider the position of the circle's origin and its radius.

Assumptions
------------------

- ```radius``` will always be greater than 0.
- ```degrees``` will always be between 0 inclusively and 360 exclusively.
- ```radians``` will always be between 0 inclusively and 2π exclusively.
- ```x``` and ```y``` will both be between -1000 and 1000.
