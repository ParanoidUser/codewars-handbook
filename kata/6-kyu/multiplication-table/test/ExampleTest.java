import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{1}}, Multiplication.multiplicationTable(1));
    assertArrayEquals(new int[][]{{1, 2, 3}, {2, 4, 6}, {3, 6, 9}}, Multiplication.multiplicationTable(3));
  }
}
