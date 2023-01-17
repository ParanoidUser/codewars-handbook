import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquarePiTest {
  @Test
  void sample() {
    assertEquals(8, new SquarePi(5).calculate());
    assertEquals(15, new SquarePi(10).calculate());
  }
}