import static java.util.function.DoubleUnaryOperator.identity;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ApproxInterTest {
  @Test
  void sample() {
    assertEquals(List.of(0.0, 2.25, 4.5, 6.75), ApproxInter.interp(identity(), 0, 9, 4));
    assertEquals(List.of(1.0, -0.99, 0.96, -0.92, 0.84, -0.76, 0.66), ApproxInter.interp(Math::cos, 0, 21, 7));
    assertEquals(List.of(0.0, 1.66, 3.33, 5.0, 6.66, 8.33, 10.0, 11.66, 13.33), ApproxInter.interp(identity(), 0, 15, 9));
    assertEquals(List.of(0.0, 0.86, -0.88, 0.01, 0.85, -0.88, 0.03, 0.84, -0.89, 0.05), ApproxInter.interp(Math::sin, 0, 21, 10));
    assertEquals(List.of(0.0, 0.99, 0.14, -0.98, -0.28, 0.93, 0.41, -0.88, -0.54, 0.8, 0.65, -0.72), ApproxInter.interp(Math::sin, 0, 18, 12));
    assertEquals(List.of(1.0, 0.31, -0.81, -0.83, 0.28, 0.99, 0.34, -0.79, -0.84, 0.25, 0.99, 0.37), ApproxInter.interp(Math::cos, 0, 15, 12));
  }
}