import static org.junit.Assert.*;

import org.junit.Test;

public class PiApproxTest {
  @Test
  public void test() {
    assertEquals("[10, 3.0418396189]", PiApprox.iterPi2String(0.1));
  }
}
