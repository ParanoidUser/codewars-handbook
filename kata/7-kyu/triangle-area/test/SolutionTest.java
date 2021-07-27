import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(.5, Kata.tArea("\n.\n. .\n"), 0.0);
    assertEquals(2, Kata.tArea("\n.\n. .\n. . .\n"), 0.0);
    assertEquals(8, Kata.tArea("\n.\n. .\n. . .\n. . . .\n. . . . .\n"), 0.0);
    assertEquals(32, Kata.tArea("\n.\n. .\n. . .\n. . . .\n. . . . .\n. . . . . .\n. . . . . . .\n. . . . . . . .\n. . . . . . . . .\n"), 0.0);
  }
}

