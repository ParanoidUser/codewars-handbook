import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IKEATest {
  @Test
  public void testOne() {
    assertTrue(IKEA.checkEnoughScrews(3, 6));
  }

  @Test
  public void testFour() {
    assertTrue(IKEA.checkEnoughScrews(4, 10));
  }

  @Test
  public void testSix() {
    assertFalse(IKEA.checkEnoughScrews(6, 20));
  }
}