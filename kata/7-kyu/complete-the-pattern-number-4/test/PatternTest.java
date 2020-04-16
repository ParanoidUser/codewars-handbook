import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatternTest {
  @Test
  public void pattern() {
    assertEquals("1", Pattern.pattern(1));
    assertEquals("12\n2", Pattern.pattern(2));
    assertEquals("12345\n2345\n345\n45\n5", Pattern.pattern(5));
    assertEquals("", Pattern.pattern(0));
    assertEquals("", Pattern.pattern(-25));
    assertEquals("", Pattern.pattern(-59));
  }
}
