import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ScaleTest {
  @Test
  void sample() {
    assertEquals("Kj\nKj\nSH\nSH", Scale.scale("Kj\nSH", 1, 2));
    assertEquals("aabbccdd\naabbccdd\naabbccdd\neeffgghh\neeffgghh\neeffgghh\niijjkkll\niijjkkll\niijjkkll\nmmnnoopp\nmmnnoopp\nmmnnoopp", Scale.scale("abcd\nefgh\nijkl\nmnop", 2, 3));
    assertEquals("", Scale.scale("", 5, 5));
  }
}
