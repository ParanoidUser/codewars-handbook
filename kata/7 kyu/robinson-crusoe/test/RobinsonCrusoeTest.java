import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobinsonCrusoeTest {
  @Test
  public void test() {
    assertCoordinates(8, 0.22, 3, 1.01, 1.15, new double[] { 1.814652098870, 0.164646220964});
    assertCoordinates(29, 0.13, 21, 1.01, 1.09, new double[] { 0.318341393410, 2.292862212314});
    assertCoordinates(45, 0.10, 3, 1.01, 1.10, new double[] { 2.689897523779, 2.477953232467});
    assertCoordinates(14, 0.22, 20, 1.02, 1.14, new double[] { 1.774076472485, 2.557008479031});
    assertCoordinates(42, 0.11, 17, 1.02, 1.09, new double[] { 0.528555980656, 2.196434600133});
  }

  private void assertCoordinates(int n, double d, int ang, double distmult, double angmult, double[] exp) {
    double[] actual = RobinsonCrusoe.crusoe(n, d, ang, distmult, angmult);
    assertEquals(exp[0], actual[0], 1e-4);
    assertEquals(exp[1], actual[1], 1e-4);
  }
}
