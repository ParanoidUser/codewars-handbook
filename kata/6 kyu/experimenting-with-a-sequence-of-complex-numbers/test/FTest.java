import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FTest {
  @Test
  public void test1() {
    assertEquals(F.f(0.64, 0.75, 1e-12), 1952, 1.0);
    assertEquals(F.f(0.3, 0.5, 1e-4), 17, 1.0);
    assertEquals(F.f(30.0, 50.0, 1e-4), -1, 1.0);
  }
}
