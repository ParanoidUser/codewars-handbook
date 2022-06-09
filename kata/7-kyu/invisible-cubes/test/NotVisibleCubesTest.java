import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NotVisibleCubesTest {
  @Test
  void sample() {
    assertEquals(1L, NotVisibleCubes.notVisibleCubes(3L));
    assertEquals(27L, NotVisibleCubes.notVisibleCubes(5L));
    assertEquals(0, NotVisibleCubes.notVisibleCubes(-514L));
  }
}
