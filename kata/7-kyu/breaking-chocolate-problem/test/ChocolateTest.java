import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChocolateTest {
  @Test
  void sample() {
    assertEquals(24, Chocolate.breakChocolate(5, 5));
    assertEquals(0, Chocolate.breakChocolate(1, 1));
  }
}
