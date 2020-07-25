import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class TortoiseTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
    assertArrayEquals(new int[]{3, 21, 49}, Tortoise.race(80, 91, 37));
    assertArrayEquals(new int[]{2, 0, 0}, Tortoise.race(80, 100, 40));
    assertNull(Tortoise.race(820, 81, 550));
  }
}
