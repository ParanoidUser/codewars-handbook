import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClockTest {
  @Test
  public void test1() {
    assertEquals(61000, Clock.Past(0, 1, 1));
  }
}
