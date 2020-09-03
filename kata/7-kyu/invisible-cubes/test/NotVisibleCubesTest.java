import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NotVisibleCubesTest {
  @Test
  void sample() {
    assertEquals(1L, new NotVisibleCubes().notVisibleCubes(3L));
    assertEquals(27L, new NotVisibleCubes().notVisibleCubes(5L));
    assertEquals(-137388096, new NotVisibleCubes().notVisibleCubes(-514L));
  }
}
