import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeightTest {
  @Test
  public void test1() {
    assertEquals(0, Pyramid.weight(0, 0), 0);
    assertEquals(0.5, Pyramid.weight(1, 0), 0);
    assertEquals(0.5, Pyramid.weight(1, 1), 0);
    assertEquals(0.75, Pyramid.weight(2, 0), 0);
    assertEquals(1.5, Pyramid.weight(2, 1), 0);
    assertEquals(0.75, Pyramid.weight(2, 2), 0);
  }
}
