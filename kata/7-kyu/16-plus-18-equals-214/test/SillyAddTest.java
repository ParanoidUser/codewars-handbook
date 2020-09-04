import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SillyAddTest {
  @Test
  void sample() {
    assertEquals(13, SillyAdditon.add(2, 11));
    assertEquals(1, SillyAdditon.add(0, 1));
    assertEquals(0, SillyAdditon.add(0, 0));
    assertEquals(214, SillyAdditon.add(16, 18));
    assertEquals(515, SillyAdditon.add(26, 39));
    assertEquals(1103, SillyAdditon.add(122, 81));
  }
}