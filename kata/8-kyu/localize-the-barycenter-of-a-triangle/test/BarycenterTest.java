import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BarycenterTest {
  @Test
  void sample() {
    assertArrayEquals(new double[]{8.6667, 6.6667}, Barycenter.barTriang(new double[]{4, 6}, new double[]{12, 4}, new double[]{10, 10}));
    assertArrayEquals(new double[]{7.3333, 4.6667}, Barycenter.barTriang(new double[]{4, 2}, new double[]{12, 2}, new double[]{6, 10}));
  }
}
