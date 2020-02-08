package com.codewars.javatlacati;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BadCollectionTest {
  @Test
  public void basicTest() {
    BadCollection bc = new BadCollection();
    bc.addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    bc.remove(9);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 10]", bc.showContent());
  }
}
