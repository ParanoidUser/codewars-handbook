import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertTrue(Codewars.detect("Can someone explain to me what this kata is about?"));
    assertFalse(Codewars.detect("Can someone solve this kata for me?"));
    assertFalse(Codewars.detect("can someone explain to me how to enable caps lock/"));
  }
}