import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MapTests {
  @Test
  void sampleTests() {
    assertArrayEquals(new int[]{2, 4, 6}, Maps.map(new int[]{1, 2, 3}));
    assertArrayEquals(new int[]{8, 2, 2, 2, 8}, Maps.map(new int[]{4, 1, 1, 1, 4}));
    assertArrayEquals(new int[]{2, 2, 2, 2, 2, 2}, Maps.map(new int[]{1, 1, 1, 1, 1, 1}));
  }
}
