import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"DOG"}, Dinglemouse.flapDisplay(new String[]{"CAT"}, new int[][]{{1, 13, 27}}));
    assertArrayEquals(new String[]{"WORLD!"}, Dinglemouse.flapDisplay(new String[]{"HELLO "}, new int[][]{{15, 49, 50, 48, 43, 13}}));
    assertArrayEquals(new String[]{"WARS"}, Dinglemouse.flapDisplay(new String[]{"CODE"}, new int[][]{{20, 20, 28, 0}}));
  }
}
