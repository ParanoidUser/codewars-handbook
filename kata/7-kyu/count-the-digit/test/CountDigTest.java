import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountDigTest {
  @Test
  public void test() {
    assertEquals(4700, CountDig.nbDig(5750, 0));
    assertEquals(9481, CountDig.nbDig(11011, 2));
    assertEquals(7733, CountDig.nbDig(12224, 8));
    assertEquals(11905, CountDig.nbDig(11549, 1));
  }
}
