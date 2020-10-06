import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindItTest {
  @Test
  void sample() {
    assertEquals(3, new FindIt().findIt("99X=1(mod 8)"));
    assertEquals(2, new FindIt().findIt("72X=1(mod 11)"));
    assertEquals(4, new FindIt().findIt("88X=1(mod 9)"));
    assertEquals(2, new FindIt().findIt("28X=1(mod 5)"));
    assertEquals(1, new FindIt().findIt("493X=1(mod 3)"));
    assertEquals(1, new FindIt().findIt("6336X=1(mod 5)"));
    assertEquals(4, new FindIt().findIt("16X=1(mod 9)"));
    assertEquals(-1, new FindIt().findIt("145X=1(mod 10)"));
  }
}