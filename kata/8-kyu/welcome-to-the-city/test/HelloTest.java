import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloTest {
  @Test
  void sample() {
    assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", new Hello().sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona"));
  }
}
