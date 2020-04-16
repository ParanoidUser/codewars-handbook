import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetMeTests {
  @Test
  public void basicTests() {
    assertEquals("Hello Riley!", GreetMe.greet("riley"));
  }
}
