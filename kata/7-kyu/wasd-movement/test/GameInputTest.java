import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class GameInputTest {
  @Test
  void sample() {
    assertArrayEquals(new float[] {0, 0}, new GameInput().getVector(new boolean[] {false, false, false, false}), 0f);
    assertArrayEquals(new float[] {0, 1f}, new GameInput().getVector(new boolean[] {true, false, false, false}), 0f);
    assertArrayEquals(new float[] {-1f, 0}, new GameInput().getVector(new boolean[] {false, true, false, false}), 0f);
    assertArrayEquals(new float[] {0, -1f}, new GameInput().getVector(new boolean[] {false, false, true, false}), 0f);
    assertArrayEquals(new float[] {0, 0}, new GameInput().getVector(new boolean[] {false, true, false, true}), 0f);
    assertArrayEquals(new float[] {0, -1f}, new GameInput().getVector(new boolean[] {false, true, true, true}), 0f);
    assertArrayEquals(new float[] {0, 0}, new GameInput().getVector(new boolean[] {true, true, true, true}), 0f);
    assertArrayEquals(new float[] {-0.70710677f, -0.70710677f}, new GameInput().getVector(new boolean[] {false, true, true, false}), 0f);
    assertArrayEquals(new float[] {0.70710677f, -0.70710677f}, new GameInput().getVector(new boolean[] {false, false, true, true}), 0f);
  }
}
