import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1}
        },
        ArrayCropper.getCroppedFieldAsArray(new int[][]{
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {1, 1, 1, 0},
            {0, 0, 0, 0}
        }));
  }
}
