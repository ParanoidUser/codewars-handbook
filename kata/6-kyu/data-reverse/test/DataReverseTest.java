import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DataReverseTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{
        1, 0, 1, 0, 1, 0, 1, 0,
        0, 0, 0, 0, 1, 1, 1, 1,
        0, 0, 0, 0, 0, 0, 0, 0,
        1, 1, 1, 1, 1, 1, 1, 1
    }, Kata.DataReverse(new int[]{
        1, 1, 1, 1, 1, 1, 1, 1,
        0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 1, 1, 1, 1,
        1, 0, 1, 0, 1, 0, 1, 0
    }));

    assertArrayEquals(new int[]{
        0, 0, 1, 0,
        1, 0, 0, 1,
        0, 0, 1, 1,
        0, 1, 1, 0
    }, Kata.DataReverse(new int[]{
        0, 0, 1, 1,
        0, 1, 1, 0,
        0, 0, 1, 0,
        1, 0, 0, 1
    }));
  }
}
