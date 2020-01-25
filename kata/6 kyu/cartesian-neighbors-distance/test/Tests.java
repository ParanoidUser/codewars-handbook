import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Tests {
  @Test
  public void exampleTest() {
    double[] list = Kata.cartesianNeighborsDistance(3, 2, 1);
    assertArrayEquals(new double[] {1.0, 1.4142135624}, list, 6e-11);

    list = Kata.cartesianNeighborsDistance(0, 0, 2);
    assertArrayEquals(new double[] {1.0, 1.4142135624, 2.0, 2.2360679775, 2.8284271247}, list, 6e-11);
  }
}
