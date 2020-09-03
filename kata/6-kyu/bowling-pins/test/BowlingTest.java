import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BowlingTest {
  @Test
  void sample() {
    assertEquals("I I I I\n I I I \n       \n       ", new Bowling().bowlingPins(new int[]{1, 2, 3}));
    assertEquals("I I   I\n I   I \n  I    \n   I   ", new Bowling().bowlingPins(new int[]{3, 5, 9}));
  }
}
