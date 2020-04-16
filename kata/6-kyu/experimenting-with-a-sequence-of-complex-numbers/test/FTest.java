import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FTest {
  @Test
  public void test1() {
    assertEquals(1952, F.f(0.64, 0.75, 1e-12), 1.0);
    assertEquals(17, F.f(0.3, 0.5, 1e-4), 1.0);
    assertEquals(-1, F.f(30.0, 50.0, 1e-4), 1.0);
  }
}
