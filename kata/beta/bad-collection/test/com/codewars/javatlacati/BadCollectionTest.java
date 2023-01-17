package com.codewars.javatlacati;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BadCollectionTest {
  @Test
  void sample() {
    BadCollection bc = new BadCollection();
    bc.addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    bc.remove(1);
    bc.remove(9);
    assertEquals("[2, 3, 4, 5, 6, 7, 8, 10]", bc.showContent());
  }
}