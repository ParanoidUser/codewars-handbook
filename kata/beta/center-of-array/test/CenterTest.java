import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CenterTest {
  @Test
  void sample() {
    assertEquals(1, Center.findCenter(new int[]{4, 1, 9}));
    assertEquals(5, Center.findCenter(new int[]{7, 4, 5, 8, 9}));
    assertEquals(10, Center.findCenter(new int[]{3, 1, 7, 10, 8, 1, 12}));
  }
}