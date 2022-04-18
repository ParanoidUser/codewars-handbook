package com.codewars.julesnuggy;

import static java.util.Arrays.stream;

interface BingoOrNot {
  static String bingo(int[] numberArray) {
    var l = stream(numberArray).boxed().toList();
    return l.contains(2) && l.contains(7) && l.contains(9) && l.contains(14) && l.contains(15) ? "WIN" : "LOSE";
  }
}
