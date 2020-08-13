package com.codewars.a.partridge;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DoubleSortTest {
  @Test
  void sample() {
    assertArrayEquals(new Integer[] {2, 3, 4, 5, 6}, DoubleSort.dbSort(new Integer[] {6, 2, 3, 4, 5}));
    assertArrayEquals(new Integer[] {3, 5, 5, 14, 32}, DoubleSort.dbSort(new Integer[] {14, 32, 3, 5, 5}));
    assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, DoubleSort.dbSort(new Integer[] {1, 2, 3, 4, 5}));
    assertArrayEquals(new Object[] {0, 1, 2, "C", "W", "W", "W"}, DoubleSort.dbSort(new Object[] {"C", "W", "W", "W", 1, 2, 0}));
    assertArrayEquals(new Object[] {0, 2, 2, "Apple", "Banana", "Mango", "Orange"}, DoubleSort.dbSort(new Object[] {"Banana", "Orange", "Apple", "Mango", 0, 2, 2}));
  }
}
