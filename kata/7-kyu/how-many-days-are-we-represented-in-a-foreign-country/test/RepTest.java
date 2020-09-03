import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RepTest {
  @Test
  void sample() {
    assertEquals(17, new Representation().daysRepresented(new int[][] {{10, 15}, {25, 35}}));
    assertEquals(19, new Representation().daysRepresented(new int[][] {{10, 15}, {12, 17}, {25, 35}}));
    assertEquals(24, new Representation().daysRepresented(new int[][] {{2, 8}, {220, 229}, {10, 16}}));
  }
}
