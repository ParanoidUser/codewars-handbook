import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTest {
  @Test
  public void test() {
    assertEquals("Hello, Jim!", Greeter.greet("Jim"));
    assertEquals("Hello, Jane!", Greeter.greet("Jane"));
    assertEquals("Hello, Simon!", Greeter.greet("Simon"));
    assertEquals("Hello, my love!", Greeter.greet("Johnny"));
  }
}
