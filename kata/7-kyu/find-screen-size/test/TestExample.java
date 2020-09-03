import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestExample {
  @Test
  void sample() {
    assertEquals("1024x768", Kata.findScreenHeight(1024, "4:3"));
    assertEquals("1280x720", Kata.findScreenHeight(1280, "16:9"));
    assertEquals("3840x1080", Kata.findScreenHeight(3840, "32:9"));
  }
}
