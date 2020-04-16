import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SimpleDateFormatterTest {
  @Test
  void testUno() {
    assertEquals("01/12/2016", SimpleDateFormatter.formatDate("1", "12", "2016"));
  }
}