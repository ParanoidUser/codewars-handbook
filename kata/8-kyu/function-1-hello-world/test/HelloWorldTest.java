import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
  @Test
  void sample() {
    assertEquals("hello world!", HelloWorld.greet());
  }
}
