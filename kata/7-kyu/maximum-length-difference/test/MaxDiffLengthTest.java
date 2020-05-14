import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxDiffLengthTest {
  @Test
  void sample() {
    assertEquals(13, MaxDiffLength.mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"}, new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));
    assertEquals(-1, MaxDiffLength.mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"}, new String[0]));
    assertEquals(-1, MaxDiffLength.mxdiflg(new String[0], new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));
  }
}
