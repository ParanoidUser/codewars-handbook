import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseTest {
  @Test
  void sample() {
    assertEquals("dlrow olleh", new Reverse().reverse("hello world"));
    assertEquals("dcba", new Reverse().reverse("abcd"));
    assertEquals("54321", new Reverse().reverse("12345"));
  }
}
