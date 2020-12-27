import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OverRoadTest {
  @Test
  void sample() {
    assertEquals(6, CodeWars.overTheRoad(1, 3));
    assertEquals(4, CodeWars.overTheRoad(3, 3));
    assertEquals(5, CodeWars.overTheRoad(2, 3));
    assertEquals(8, CodeWars.overTheRoad(3, 5));
    assertEquals(16, CodeWars.overTheRoad(7, 11));
  }
}