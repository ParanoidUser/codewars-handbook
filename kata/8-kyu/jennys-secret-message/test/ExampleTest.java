import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertEquals("Hello, Jim!", Greeter.greet("Jim"));
    assertEquals("Hello, Jane!", Greeter.greet("Jane"));
    assertEquals("Hello, Simon!", Greeter.greet("Simon"));
    assertEquals("Hello, my love!", Greeter.greet("Johnny"));
  }
}
