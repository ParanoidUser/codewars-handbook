import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertTrue(DD.isDD(30313));
    assertTrue(DD.isDD(122));
    assertTrue(DD.isDD(664444309));
    assertFalse(DD.isDD(5023011));
    assertFalse(DD.isDD(9081231));
  }
}
