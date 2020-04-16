import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals("H!!", Solution.replace("Hi!"));
    assertEquals("!H!! H!!", Solution.replace("!Hi! Hi!"));
    assertEquals("!!!!!", Solution.replace("aeiou"));
    assertEquals("!BCD!", Solution.replace("ABCDE"));
  }
}
