import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VectorMagnitudeTest {
  @Test
  public void zeroVector() {
    double[] vector = new double[] {0d, 0d};
    assertEquals(0d, Kata.magnitude(vector), 1e-10);
  }

  @Test
  public void unitVector() {
    double[] vector = new double[] {2d / 3d, 1d / 3d, 2d / 3d};
    assertEquals(1d, Kata.magnitude(vector), 1e-10);
  }

  @Test
  public void negativeValues() {
    double[] vector = new double[] {-2d, -4d, 4d};
    assertEquals(6d, Kata.magnitude(vector), 1e-10);
  }
}
