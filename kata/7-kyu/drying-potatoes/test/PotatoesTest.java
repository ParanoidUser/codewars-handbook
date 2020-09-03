import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PotatoesTest {
  @Test
  void sample() {
    assertEquals(114, Potatoes.potatoes(82, 127, 80));
    assertEquals(100, Potatoes.potatoes(93, 129, 91));
  }
}
