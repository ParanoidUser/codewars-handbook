import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void examples() {
    assertEquals('R', Kata.triangle("GB"));
    assertEquals('R', Kata.triangle("RRR"));
    assertEquals('B', Kata.triangle("RGBG"));
    assertEquals('G', Kata.triangle("RBRGBRB"));
    assertEquals('G', Kata.triangle("RBRGBRBGGRRRBGBBBGG"));
    assertEquals('B', Kata.triangle("B"));
  }
}
