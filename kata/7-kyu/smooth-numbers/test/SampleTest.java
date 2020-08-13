import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("humble number", Solution.isSmooth(7));
    assertEquals("power of 2", Solution.isSmooth(16));
    assertEquals("non-smooth", Solution.isSmooth(17));
    assertEquals("3-smooth", Solution.isSmooth(36));
    assertEquals("Hamming number", Solution.isSmooth(60));
    assertEquals("humble number", Solution.isSmooth(98));
    assertEquals("non-smooth", Solution.isSmooth(111));
    assertEquals("3-smooth", Solution.isSmooth(729));
    assertEquals("Hamming number", Solution.isSmooth(3125));
    assertEquals("power of 2", Solution.isSmooth(4096));
  }
}
