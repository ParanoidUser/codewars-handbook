import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertArrayEquals(new String[] {"a", "b", "c"}, Dinglemouse.split("a.b.c"));
    assertArrayEquals(new String[] {"a", "", "c"}, Dinglemouse.split("a..c"));
    assertArrayEquals(new String[0], Dinglemouse.split(""));
  }
}
