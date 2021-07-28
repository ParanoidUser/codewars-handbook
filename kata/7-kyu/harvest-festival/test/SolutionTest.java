import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("-+", Kata.plant('+', 1, 3, 15));
    assertEquals("---------@", Kata.plant('@', 3, 3, 35));
    assertEquals("---,,,,,,,---,,,,,,,---,,,,,,,", Kata.plant(',', 3, 7, 25));
    assertEquals("---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;", Kata.plant(';', 9, 10, 30));
  }
}