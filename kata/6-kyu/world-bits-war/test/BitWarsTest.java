import static codewars.BitWars.bitsWar;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BitWarsTest {
  @Test
  void sample() {
    assertEquals("odds win", bitsWar(new int[]{1, 5, 12}));
    assertEquals("evens win", bitsWar(new int[]{7, -3, 20}));
    assertEquals("tie", bitsWar(new int[]{7, -3, -2, 6}));
    assertEquals("evens win", bitsWar(new int[]{-3, -5}));
    assertEquals("tie", bitsWar(new int[0]));
  }
}