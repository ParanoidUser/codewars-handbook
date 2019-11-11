import static org.junit.Assert.*;
import org.junit.Test;

public class SlopeTest {
  @Test
  public void test1() {
    assertEquals("0", Slope.slope(new int[] {19, 3, 20, 3}));
    assertEquals("undefined", Slope.slope(new int[] {-7, 2, -7, 4}));
    assertEquals("5", Slope.slope(new int[] {10, 50, 30, 150}));
    assertEquals("-5", Slope.slope(new int[] {15, 45, 12, 60}));
    assertEquals("6", Slope.slope(new int[] {10, 20, 20, 80}));
    assertEquals("undefined", Slope.slope(new int[] {-10, 6, -10, 3}));
  }
}
