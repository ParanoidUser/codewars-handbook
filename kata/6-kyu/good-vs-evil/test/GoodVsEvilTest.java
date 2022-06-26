import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GoodVsEvilTest {
  @Test
  void sample() {
    assertEquals("Battle Result: Evil eradicates all trace of Good", GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    assertEquals("Battle Result: Good triumphs over Evil", GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    assertEquals("Battle Result: No victor on this battle field", GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
  }
}