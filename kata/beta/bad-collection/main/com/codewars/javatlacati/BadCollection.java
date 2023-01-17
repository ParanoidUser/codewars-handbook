package com.codewars.javatlacati;

import static java.util.Arrays.stream;

import java.util.HashSet;
import java.util.Set;

class BadCollection {
  final Set<Short> set = new HashSet<>();

  void addAll(int... numbers) {
    stream(numbers).forEach(i -> set.add((short) i));
  }

  void remove(int number) {
    set.remove((short) number);
  }

  String showContent() {
    return set.toString();
  }
}