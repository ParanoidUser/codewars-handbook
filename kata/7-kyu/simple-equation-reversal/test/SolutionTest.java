import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("95/h+e-6+23-r/75+57+66/3+g/59+38/25/31", Solution.solve("31/25/38+59/g+3/66+57+75/r-23+6-e+h/95"));
    assertEquals("y/b*100", Solution.solve("100*b/y"));
    assertEquals("30*d/c-b+a", Solution.solve("a+b-c/d*30"));
    assertEquals("50+c/b*a", Solution.solve("a*b/c+50"));
  }
}