import static org.junit.Assert.*;
import org.junit.Test;

public class QuadraticMainTest {
  @Test
  public void test1() {
    assertFuzzyEquals(7, 4.00e+13, 8);
    assertFuzzyEquals(9, 1.00e+14, 1);
    assertFuzzyEquals(3, 3.00e+09, 1);
    assertFuzzyEquals(7, 4.00e+09, 7);
  }

  private void assertFuzzyEquals(double a, double b, double c) {
    double x = Quadratic.quadratic(a, b, c);
    assertTrue(Math.abs(x) < 1.e-1 && Math.abs(a * x * x + b * x + c) <= 1e-12);
  }
}
