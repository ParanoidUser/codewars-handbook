import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class BarycenterTest {
  @Test
  public void test() {
    assertArrayEquals(new double[] {8.6667, 6.6667}, Barycenter.barTriang(new double[] {4, 6}, new double[] {12, 4}, new double[] {10, 10}));
    assertArrayEquals(new double[] {7.3333, 4.6667}, Barycenter.barTriang(new double[] {4, 2}, new double[] {12, 2}, new double[] {6, 10}));
  }
}
