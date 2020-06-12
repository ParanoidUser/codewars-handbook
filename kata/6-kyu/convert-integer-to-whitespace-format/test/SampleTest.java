import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(" \t\n", Kata.whitespaceNumber(1));
    assertEquals(" \n", Kata.whitespaceNumber(0));
    assertEquals("\t\t\n", Kata.whitespaceNumber(-1));
    assertEquals(" \t \n", Kata.whitespaceNumber(2));
    assertEquals("\t\t\t\n", Kata.whitespaceNumber(-3));
  }
}
