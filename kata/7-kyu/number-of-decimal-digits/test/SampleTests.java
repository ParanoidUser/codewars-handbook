import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {
  @Test
  public void digits() {
    assertEquals(1, DecTools.Digits(5L));
    assertEquals(5, DecTools.Digits(12345L));
    assertEquals(10, DecTools.Digits(9876543210L));
  }
}
