package com.codewars.kata.kyu2;

import java.util.*;

/**
 * @see <a href="https://www.codewars.com/kata/cut-the-cake">Cut the cake</a>
 */
public class CakeCutter
{
    private long     raisins;
    private char[][] crumbs;
    private int      sliceSize;

    public CakeCutter(String cake)
    {
        raisins = cake.chars().filter(i -> i == 'o').count();
        crumbs = cake.lines().map(String::toCharArray).toArray(char[][]::new);
        sliceSize = crumbs.length * crumbs[0].length / (int) raisins;
    }

    public List<String> cut()
    {
        return cutInto(crumbs, new ArrayList<>());
    }

    private List<String> cutInto(char[][] cake, List<String> slices)
    {
        var position = startSlicingAt(cake);
        if (position.isEmpty())
        {
            return slices;
        }

        int column = position.get(0);
        int row = position.get(1);

        for (int width = cake[0].length; width > 0; width--)
        {
            for (int height = 1; height <= cake.length; height++)
            {
                if (!checkIfCanSlice(cake, row, column, width, height))
                {
                    continue;
                }

                var cakeCopy = new char[cake.length][];
                for (int i = 0; i < cake.length; i++)
                {
                    cakeCopy[i] = Arrays.copyOf(cake[i], cake[i].length);
                }

                var slicesCopy = new ArrayList<>(slices);
                var slice = sliceAt(cakeCopy, row, column, width, height);
                slicesCopy.add(reunite(slice));

                if (slicesCopy.size() == raisins)
                {
                    return slicesCopy;
                }

                var list = cutInto(cakeCopy, slicesCopy);
                if (list.size() > slicesCopy.size())
                {
                    return list;
                }
            }
        }

        return List.of();
    }

    private List<Integer> startSlicingAt(char[][] cake)
    {
        for (int y = 0; y < cake.length; y++)
        {
            for (int x = 0; x < cake[y].length; x++)
            {
                if (cake[y][x] != ' ')
                {
                    return List.of(y, x);
                }
            }
        }
        return List.of();
    }

    private char[][] sliceAt(char[][] cake, int row, int column, int width, int height)
    {
        char[][] slice = new char[height][width];
        for (int y = column; y < column + height; y++)
        {
            for (int x = row; x < row + width; x++)
            {
                slice[y - column][x - row] = cake[y][x];
                cake[y][x] = ' ';
            }
        }
        return slice;
    }

    private boolean checkIfCanSlice(char[][] cake, int row, int column, int width, int height)
    {
        if (row + width > cake[0].length || column + height > cake.length || height * width != sliceSize)
        {
            return false;
        }

        int raisin = 0;
        for (int y = column; y < column + height; y++)
        {
            for (int x = row; x < row + width; x++)
            {
                if (cake[y][x] == 'o')
                {
                    raisin++;
                }
                else if (cake[y][x] == ' ')
                {
                    return false;
                }
            }
        }
        return raisin == 1;
    }

    private String reunite(char[][] crumbs)
    {
        StringJoiner joiner = new StringJoiner("\n");
        for (char[] line : crumbs)
        {
            joiner.add(new String(line));
        }
        return joiner.toString();
    }
}
