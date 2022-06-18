import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("1334141552114243", Solution.polybius("CODEWARS"));
    assertEquals("3534315412244543 434145114215 132435231542", Solution.polybius("POLYBIUS SQUARE CIPHER"));
  }
}
