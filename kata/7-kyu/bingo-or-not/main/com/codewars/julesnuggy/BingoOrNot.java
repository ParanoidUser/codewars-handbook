package com.codewars.julesnuggy;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

class BingoOrNot {
  static String bingo(int[] numberArray) {
    var l = stream(numberArray).boxed().collect(toList());
    return l.contains(2) && l.contains(9) && l.contains(14) && l.contains(7) && l.contains(15) ? "WIN" : "LOSE";
  }
}
