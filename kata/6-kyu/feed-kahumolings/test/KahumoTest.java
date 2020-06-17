import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KahumoTest {
  @Test
  void sample() {
    assertArrayEquals(new double[]{1, 2, 4, 8, 16}, Kahumo.serve(31, 2, 5), 0.009);
    assertArrayEquals(new double[]{2, 6, 18, 54, 162, 486}, Kahumo.serve(728, 3, 6), 0.009);
    assertArrayEquals(new double[]{21.053, 31.579, 47.368}, Kahumo.serve(100, 1.5, 3), 0.009);
    assertArrayEquals(new double[]{6.2, 6.2, 6.2, 6.2, 6.2}, Kahumo.serve(31, 1.0, 5), 0.009);
  }
}
