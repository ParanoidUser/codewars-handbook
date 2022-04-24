import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TestExample {
  @Test
  void sample() {
    assertArrayEquals(new int[]{2, 3, 4}, Math.interval(new int[]{1, 2, 3, 4, 5}, "[2,5)"));
    assertArrayEquals(new int[]{2, 3, 4, 5}, Math.interval(new int[]{1, 2, 3, 4, 5}, "[2,5]"));
    assertArrayEquals(new int[]{3, 4, 5}, Math.interval(new int[]{1, 2, 3, 4, 5}, "(2,5]"));
    assertArrayEquals(new int[]{3, 4}, Math.interval(new int[]{1, 2, 3, 4, 5}, "(2,5)"));
    assertArrayEquals(new int[]{}, Math.interval(new int[]{1, 2, 3, 4, 5}, ""));
    assertArrayEquals(new int[]{}, Math.interval(new int[]{}, "(2,5)"));
  }
}