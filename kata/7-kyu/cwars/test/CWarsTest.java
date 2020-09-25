import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CWarsTest {
  @Test
  void sample() {
    assertEquals("C.Wars", CWars.initials("code wars"));
    assertEquals("B.H.Obama", CWars.initials("Barack hussain obama"));
    assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
  }
}
