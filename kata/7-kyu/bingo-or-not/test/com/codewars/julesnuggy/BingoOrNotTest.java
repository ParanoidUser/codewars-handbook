package com.codewars.julesnuggy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BingoOrNotTest {
  @Test
  void sample() {
    assertEquals("LOSE", BingoOrNot.bingo(new int[]{21, 13, 3, 7, 5, 14, 7, 15, 9, 10}));
    assertEquals("LOSE", BingoOrNot.bingo(new int[]{21, 13, 2, 8, 5, 14, 8, 15, 9, 10}));
    assertEquals("LOSE", BingoOrNot.bingo(new int[]{21, 13, 2, 7, 5, 14, 7, 15, 4, 10}));
    assertEquals("LOSE", BingoOrNot.bingo(new int[]{21, 13, 2, 7, 5, 11, 7, 15, 9, 10}));
    assertEquals("LOSE", BingoOrNot.bingo(new int[]{21, 13, 2, 7, 5, 14, 7, 11, 9, 10}));
    assertEquals("WIN", BingoOrNot.bingo(new int[]{21, 13, 2, 7, 5, 14, 7, 15, 9, 10}));
  }
}
