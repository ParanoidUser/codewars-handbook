import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BonusTimeTest {
  @Test
  void sample() {
    assertEquals("£100000", Kata.bonusTime(10000, true));
    assertEquals("£250000", Kata.bonusTime(25000, true));
    assertEquals("£10000", Kata.bonusTime(10000, false));
    assertEquals("£60000", Kata.bonusTime(60000, false));
    assertEquals("£20", Kata.bonusTime(2, true));
    assertEquals("£78", Kata.bonusTime(78, false));
    assertEquals("£678900", Kata.bonusTime(67890, true));
  }
}
