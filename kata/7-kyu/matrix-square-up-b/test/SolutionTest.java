import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[][]{
        {"x", "1"},
        {"2", "1"}
    }, Kata.matrixSquareUp(2));

    assertArrayEquals(new String[][]{
        {"x", "x", "1"},
        {"x", "2", "1"},
        {"3", "2", "1"}
    }, Kata.matrixSquareUp(3));

    assertArrayEquals(new String[][]{
        {"x", "x", "x", "1"},
        {"x", "x", "2", "1"},
        {"x", "3", "2", "1"},
        {"4", "3", "2", "1"}
    }, Kata.matrixSquareUp(4));
  }
}
