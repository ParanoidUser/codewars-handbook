import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeightTest {
  @Test
  public void test1() {
    assertEquals(Pyramid.weight(0, 0), 0, 0);

    assertEquals(Pyramid.weight(1, 0), 0.5, 0);
    assertEquals(Pyramid.weight(1, 1), 0.5, 0);

    assertEquals(Pyramid.weight(2, 0), 0.75, 0);
    assertEquals(Pyramid.weight(2, 1), 1.5, 0);
    assertEquals(Pyramid.weight(2, 2), 0.75, 0);
  }
}
