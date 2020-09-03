import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertArrayEquals(new long[] {1, 1}, Dinglemouse.clonewars(1));
    assertArrayEquals(new long[] {16, 57}, Dinglemouse.clonewars(5));
    assertArrayEquals(new long[] {512, 2036}, Dinglemouse.clonewars(10));
  }
}
