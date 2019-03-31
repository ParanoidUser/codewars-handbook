package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/circles-in-polygons">Circles in Polygons</a>
 */
public class Polygon
{
    private final double diameter;

    Polygon(int sides, int sideLength)
    {
        this.diameter = sideLength / Math.tan(Math.toRadians(180d / sides));
    }

    double circleDiameter()
    {
        return diameter;
    }
}