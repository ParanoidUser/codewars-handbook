import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void checkSmallValues() {
    assertTrue(Kata.consecutiveDucks(13));
    assertTrue(Kata.consecutiveDucks(6));
    assertTrue(Kata.consecutiveDucks(69));
    assertFalse(Kata.consecutiveDucks(8));
    assertTrue(Kata.consecutiveDucks(57));
    assertFalse(Kata.consecutiveDucks(16));
    assertTrue(Kata.consecutiveDucks(91));
  }

  @Test
  void checkMediumValues() {
    assertTrue(Kata.consecutiveDucks(522));
    assertTrue(Kata.consecutiveDucks(974));
    assertTrue(Kata.consecutiveDucks(755));
    assertFalse(Kata.consecutiveDucks(512));
    assertTrue(Kata.consecutiveDucks(739));
    assertTrue(Kata.consecutiveDucks(1006));
    assertTrue(Kata.consecutiveDucks(838));
  }

  @Test
  void checkLargeValues() {
    assertTrue(Kata.consecutiveDucks(382131));
    assertTrue(Kata.consecutiveDucks(118070));
    assertTrue(Kata.consecutiveDucks(17209));
    assertFalse(Kata.consecutiveDucks(32768));
    assertTrue(Kata.consecutiveDucks(161997));
    assertTrue(Kata.consecutiveDucks(400779));
    assertTrue(Kata.consecutiveDucks(198331));
  }
}