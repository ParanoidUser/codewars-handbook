import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void issuerTests() {
    assertEquals("VISA", Kata.getIssuer("4111111111111111"));
    assertEquals("AMEX", Kata.getIssuer("378282246310005"));
    assertEquals("Unknown", Kata.getIssuer("9111111111111111"));
    assertEquals("Mastercard", Kata.getIssuer("5105105105105100"));
  }
}
