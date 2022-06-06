import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwiceAsOldTest {
  @Test
  void sample() {
    assertEquals(30, TwiceAsOld.twiceAsOld(30, 0));
    assertEquals(16, TwiceAsOld.twiceAsOld(30, 7));
    assertEquals(15, TwiceAsOld.twiceAsOld(45, 30));
  }
}
