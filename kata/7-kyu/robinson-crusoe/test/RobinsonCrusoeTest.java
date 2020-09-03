import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RobinsonCrusoeTest {
  @Test
  void sample() {
    assertArrayEquals(new double[]{1.814652098870, 0.164646220964}, RobinsonCrusoe.crusoe(8, 0.22, 3, 1.01, 1.15), 1e-4);
    assertArrayEquals(new double[]{0.318341393410, 2.292862212314}, RobinsonCrusoe.crusoe(29, 0.13, 21, 1.01, 1.09), 1e-4);
    assertArrayEquals(new double[]{2.689897523779, 2.477953232467}, RobinsonCrusoe.crusoe(45, 0.10, 3, 1.01, 1.10), 1e-4);
    assertArrayEquals(new double[]{1.774076472485, 2.557008479031}, RobinsonCrusoe.crusoe(14, 0.22, 20, 1.02, 1.14), 1e-4);
    assertArrayEquals(new double[]{0.528555980656, 2.196434600133}, RobinsonCrusoe.crusoe(42, 0.11, 17, 1.02, 1.09), 1e-4);
  }
}
