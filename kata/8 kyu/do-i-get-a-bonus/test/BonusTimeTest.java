import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BonusTimeTest {
  @Test
  public void basicTests() {
    boolean wellConfigured = "\u00A3".equalsIgnoreCase("£");
    assertEquals((wellConfigured ? "£" : "\u00A3") + "100000", Kata.bonusTime(10000, true));
    assertEquals((wellConfigured ? "£" : "\u00A3") + "250000", Kata.bonusTime(25000, true));
    assertEquals((wellConfigured ? "£" : "\u00A3") + "10000", Kata.bonusTime(10000, false));
    assertEquals((wellConfigured ? "£" : "\u00A3") + "60000", Kata.bonusTime(60000, false));
    assertEquals((wellConfigured ? "£" : "\u00A3") + "20", Kata.bonusTime(2, true));
    assertEquals((wellConfigured ? "£" : "\u00A3") + "78", Kata.bonusTime(78, false));
    assertEquals((wellConfigured ? "£" : "\u00A3") + "678900", Kata.bonusTime(67890, true));
  }
}
