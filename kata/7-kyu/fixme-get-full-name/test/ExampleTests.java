import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("Clint Eastwood", new Dinglemouse("Clint", "Eastwood").getFullName());
  }
}
