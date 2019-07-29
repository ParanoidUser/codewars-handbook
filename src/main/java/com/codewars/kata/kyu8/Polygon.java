package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5a026a9cffe75fbace00007f">Circles in Polygons</a>
 */
class Polygon
{
    private final double diameter;

    Polygon(int sides, int sideLength)
    {
        diameter = sideLength / Math.tan(Math.toRadians(180d / sides));
    }

    double circleDiameter()
    {
        return diameter;
    }
}