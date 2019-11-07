import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoolToStrTest {
  @Test
  public void testTrue() {
    assertEquals(BooleanToString.convert(true), "true");
  }

  @Test
  public void testFalse() {
    assertEquals(BooleanToString.convert(false), "false");
  }
}
