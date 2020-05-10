import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HowDoICompareTest {
  @Test
  void sample() {
    assertEquals("nothing", HowDoICompare.whatIs(0));
    assertEquals("nothing", HowDoICompare.whatIs(123));
    assertEquals("nothing", HowDoICompare.whatIs(-1));
    assertEquals("everything", HowDoICompare.whatIs(42));
    assertEquals("everything squared", HowDoICompare.whatIs(1764));
  }
}
