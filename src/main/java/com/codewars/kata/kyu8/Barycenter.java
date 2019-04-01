package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/5601c5f6ba804403c7000004">Localize The Barycenter of a Triangle</a>
 */
class Barycenter
{
    public static double[] kata(double[] x, double[] y, double[] z)
    {
        var coordinates = new double[2];
        for (int i = 0; i < 2; i++)
        {
            coordinates[i] = Math.round((x[i] + y[i] + z[i]) * 3333.33) / 10.0e3;
        }
        return coordinates;
    }
}