import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExamplesTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{1, 13, 27}}, Dinglemouse.flapRotors(new String[]{"CAT"}, new String[]{"DOG"}));
    assertArrayEquals(new int[][]{{20, 20, 28, 0}}, Dinglemouse.flapRotors(new String[]{"CODE"}, new String[]{"WARS"}));
    assertArrayEquals(new int[][]{{15, 49, 50, 48, 43, 13}}, Dinglemouse.flapRotors(new String[]{"HELLO "}, new String[]{"WORLD!"}));
  }
}
