package com.codewars.hwtdstrngls;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoundToTheNextMultipleOf5Test {
  @Test
  void sample() {
    assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(0));
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(1));
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(3));
    assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(5));
    assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(7));
    assertEquals(40, RoundToTheNextMultipleOf5.roundToNext5(39));
  }
}
