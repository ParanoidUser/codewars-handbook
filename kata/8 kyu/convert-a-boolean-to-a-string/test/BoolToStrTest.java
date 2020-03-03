import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoolToStrTest {
  @Test
  public void testTrue() {
    assertEquals("true", BooleanToString.convert(true));
  }

  @Test
  public void testFalse() {
    assertEquals("false", BooleanToString.convert(false));
  }
}
