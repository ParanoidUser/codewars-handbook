import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(1, Dinglemouse.riders(new int[] {18, 15}));
    assertEquals(2, Dinglemouse.riders(new int[] {43, 23, 40, 13}));
    assertEquals(3, Dinglemouse.riders(new int[] {33, 8, 16, 47, 30, 30, 46}));
    assertEquals(4, Dinglemouse.riders(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
  }
}
