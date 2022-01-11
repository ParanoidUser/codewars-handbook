import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StrongNumberTest {
  @Test
  void sample() {
    assertEquals("STRONG!!!!", StrongNumber.isStrongNumber(1));
    assertEquals("STRONG!!!!", StrongNumber.isStrongNumber(2));
    assertEquals("STRONG!!!!", StrongNumber.isStrongNumber(145));
    assertEquals("Not Strong !!", StrongNumber.isStrongNumber(7));
    assertEquals("Not Strong !!", StrongNumber.isStrongNumber(93));
    assertEquals("Not Strong !!", StrongNumber.isStrongNumber(185));
  }
}
