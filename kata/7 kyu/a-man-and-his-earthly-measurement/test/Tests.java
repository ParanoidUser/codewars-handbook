import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
  @Test
  public void EarthTest() {
    double circ = Eratosthenes.circumference(8.1, 1.0, 800);
    assertEquals(40075.00, circ, circ * 0.05);
  }

  @Test
  public void Test1() {
    double circ = Eratosthenes.circumference(1, 5, 20);
    assertEquals(91.0, circ, circ * 0.05);
  }

  @Test
  public void Test2() {
    double circ = Eratosthenes.circumference(2, 5, 50);
    assertEquals(264.0, circ, circ * 0.05);
  }
}
