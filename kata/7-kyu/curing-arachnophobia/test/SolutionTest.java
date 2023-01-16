import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("^(oWo)^", Spiders.drawSpider(1, 1, 'W', 'o'));
    assertEquals("/\\((OOwOO))/\\", Spiders.drawSpider(2, 2, 'w', 'O'));
    assertEquals("/╲(((0000w0000)))╱\\", Spiders.drawSpider(3, 3, 'w', '0'));
  }
}