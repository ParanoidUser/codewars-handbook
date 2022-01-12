import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BudTest {
  @Test
  void sample() {
    assertEquals("", Bud.computerToPhone(""));
    assertEquals("000", Bud.computerToPhone("000"));
    assertEquals("34567", Bud.computerToPhone("94561"));
    assertEquals("0123456789", Bud.computerToPhone("0789456123"));
  }
}
