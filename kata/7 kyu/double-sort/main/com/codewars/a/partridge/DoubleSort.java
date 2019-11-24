package com.codewars.a.partridge;

import java.util.stream.Stream;

class DoubleSort {
  static Object[] dbSort(Object[] a) {
    var numbers = Stream.of(a).filter(Integer.class::isInstance).sorted();
    var letters = Stream.of(a).filter(String.class::isInstance).sorted();
    return Stream.concat(numbers, letters).toArray();
  }
}
