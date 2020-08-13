import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("VISA", Kata.getIssuer("4111111111111111"));
    assertEquals("AMEX", Kata.getIssuer("378282246310005"));
    assertEquals("Unknown", Kata.getIssuer("9111111111111111"));
    assertEquals("Discover", Kata.getIssuer("6011906823002608"));
    assertEquals("Mastercard", Kata.getIssuer("5105105105105100"));
  }
}
