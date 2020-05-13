import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MarbleTest {
  @Test
  void sample() {
    assertEquals(0.6, BlueAndRedMarbles.guessBlue(5, 5, 2, 3), 10e-6);
    assertEquals(0.8, BlueAndRedMarbles.guessBlue(16, 12, 4, 9), 10e-6);
  }
}
