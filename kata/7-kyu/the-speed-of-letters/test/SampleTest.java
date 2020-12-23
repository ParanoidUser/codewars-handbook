import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("A                         Z", Kata.speedify("AZ"));
    assertEquals("A B C", Kata.speedify("ABC"));
    assertEquals("A  C  E", Kata.speedify("ACE"));
    assertEquals("  A", Kata.speedify("CBA"));
    assertEquals("     E H    DLL   OLO   R  W", Kata.speedify("HELLOWORLD"));
  }
}