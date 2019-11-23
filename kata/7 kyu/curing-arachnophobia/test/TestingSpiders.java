import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingSpiders {
  @Test
  public void testBasic() {
    assertEquals("^(oWo)^", Spiders.drawSpider(1, 1, 'W', 'o'));
    assertEquals("/\\((OOwOO))/\\", Spiders.drawSpider(2, 2, 'w', 'O'));
    assertEquals("/╲(((0000w0000)))╱\\", Spiders.drawSpider(3, 3, 'w', '0'));
  }
}
