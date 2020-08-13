import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BitsBattleTest {
  @Test
  void sample() {
    assertEquals("odds win", BitsBattle.bitsBattle(new int[] {5, 3, 14}));
    assertEquals("evens win", BitsBattle.bitsBattle(new int[] {3, 8, 22, 15, 78}));
    assertEquals("tie", BitsBattle.bitsBattle(new int[] {}));
    assertEquals("tie", BitsBattle.bitsBattle(new int[] {1, 13, 16}));
    assertEquals("tie", BitsBattle.bitsBattle(new int[] {0}));
  }
}
