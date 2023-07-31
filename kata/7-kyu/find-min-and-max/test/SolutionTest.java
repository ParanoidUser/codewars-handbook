import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1, 1}, MinMax.getMinMax(List.of(1)));
    assertArrayEquals(new int[]{1, 2}, MinMax.getMinMax(List.of(1, 2)));
    assertArrayEquals(new int[]{1, 2}, MinMax.getMinMax(List.of(2, 1)));
  }
}