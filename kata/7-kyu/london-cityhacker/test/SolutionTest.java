import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("£7.80", Kata.londonCityHacker(new Object[]{12, "Central", "Circle", 21}));
    assertEquals("£3.90", Kata.londonCityHacker(new Object[]{"Piccidilly", 56}));
    assertEquals("£7.20", Kata.londonCityHacker(new Object[]{"Northern", "Central", "Circle"}));
    assertEquals("£5.40", Kata.londonCityHacker(new Object[]{"Piccidilly", 56, 93, 243}));
    assertEquals("£3.00", Kata.londonCityHacker(new Object[]{386, 56, 1, 876}));
    assertEquals("£0.00", Kata.londonCityHacker(new Object[0]));
  }
}
