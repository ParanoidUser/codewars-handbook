import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals('R', Kata.triangle("GB"));
    assertEquals('R', Kata.triangle("RRR"));
    assertEquals('B', Kata.triangle("RGBG"));
    assertEquals('G', Kata.triangle("RBRGBRB"));
    assertEquals('G', Kata.triangle("RBRGBRBGGRRRBGBBBGG"));
    assertEquals('B', Kata.triangle("B"));
  }
}
