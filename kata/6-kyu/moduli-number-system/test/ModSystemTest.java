import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ModSystemTest {
  @Test
  void sample() {
    assertEquals("Not applicable", ModSystem.fromNb2Str(187, new int[0]));
    assertEquals("Not applicable", ModSystem.fromNb2Str(187, new int[]{8, 7, 5, 4}));
    assertEquals("-3--5--2--1-", ModSystem.fromNb2Str(187, new int[]{8, 7, 5, 3}));
  }
}
