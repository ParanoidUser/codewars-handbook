package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleInBusTest
{
    @Test
    void test1()
    {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{ 10, 0 });
        list.add(new int[]{ 3, 5 });
        list.add(new int[]{ 2, 5 });
        assertEquals(5, PeopleInBus.kata(list));
    }
}
