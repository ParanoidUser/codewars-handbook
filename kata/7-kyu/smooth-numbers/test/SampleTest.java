import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals("power of 2", Solution.isSmooth(16));
    assertEquals("3-smooth", Solution.isSmooth(36));
    assertEquals("Hamming number", Solution.isSmooth(60));
    assertEquals("humble number", Solution.isSmooth(98));
    assertEquals("non-smooth", Solution.isSmooth(111));
    assertEquals("power of 2", Solution.isSmooth(4096));
    assertEquals("3-smooth", Solution.isSmooth(729));
    assertEquals("Hamming number", Solution.isSmooth(3125));
    assertEquals("humble number", Solution.isSmooth(7));
    assertEquals("non-smooth", Solution.isSmooth(17));
  }
}
