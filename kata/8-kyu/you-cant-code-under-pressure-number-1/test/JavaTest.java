import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaTest {
  @Test
  public final void test_all() {
    assertEquals("Nope!", 4, Java.doubleInteger(2));
  }
}
