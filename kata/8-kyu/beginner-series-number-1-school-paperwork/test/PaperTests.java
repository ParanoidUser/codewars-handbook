import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PaperTests {
  @Test
  void sample() {
    assertEquals(25, Paper.paperWork(5, 5));
    assertEquals(0, Paper.paperWork(-5, 5));
    assertEquals(0, Paper.paperWork(5, -5));
  }
}