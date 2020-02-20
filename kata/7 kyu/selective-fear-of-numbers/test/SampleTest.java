import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {
  @Test
  public void fixedTests() {
    assertFalse(Arithmophobia.AmIAfraid("Monday", 13));
    assertTrue(Arithmophobia.AmIAfraid("Sunday", -666));
    assertFalse(Arithmophobia.AmIAfraid("Tuesday", 2));
    assertTrue(Arithmophobia.AmIAfraid("Tuesday", 965));
    assertTrue(Arithmophobia.AmIAfraid("Friday", 2));
  }
}
