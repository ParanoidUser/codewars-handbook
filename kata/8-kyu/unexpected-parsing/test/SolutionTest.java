import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("busy", Kata.getStatus(true).get("status"));
    assertEquals("available", Kata.getStatus(false).get("status"));
  }
}